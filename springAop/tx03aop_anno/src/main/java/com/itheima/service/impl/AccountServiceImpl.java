package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 账户的业务层实现类
 * <p>
 * 事务控制应该都是在业务层
 */


/**
 * 1. TransactionDefinition.PROPAGATION_REQUIRED：
 *    如果当前存在事务，则加入该事务；如果当前没有事务，则创建一个新的事务。这是默认值。
 *
 * 2. TransactionDefinition.PROPAGATION_REQUIRES_NEW：
 *    创建一个新的事务，如果当前存在事务，则把当前事务挂起。
 *
 * 3. TransactionDefinition.PROPAGATION_SUPPORTS：
 *    如果当前存在事务，则加入该事务；如果当前没有事务，则以非事务的方式继续运行。
 *
 * 4. TransactionDefinition.PROPAGATION_NOT_SUPPORTED：
 *    以非事务方式运行，如果当前存在事务，则把当前事务挂起。
 *
 * 5. TransactionDefinition.PROPAGATION_NEVER：
 *    以非事务方式运行，如果当前存在事务，则抛出异常。
 *
 * 6. TransactionDefinition.PROPAGATION_MANDATORY：
 *    如果当前存在事务，则加入该事务；如果当前没有事务，则抛出异常。
 *
 * 7. TransactionDefinition.PROPAGATION_NESTED：
 *    如果当前存在事务，则创建一个事务作为当前事务的嵌套事务来运行；
 *    如果当前没有事务，则该取值等价于TransactionDefinition.PROPAGATION_REQUIRED。
 */
@Service("accountService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)//只读型事务的配置
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;


    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);

    }


    //需要的是读写型事务配置
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transfer....");
        //2.1根据名称查询转出账户
        Account source = accountDao.findAccountByName(sourceName);
        //2.2根据名称查询转入账户
        Account target = accountDao.findAccountByName(targetName);
        //2.3转出账户减钱
        source.setMoney(source.getMoney() - money);
        //2.4转入账户加钱
        target.setMoney(target.getMoney() + money);
        //2.5更新转出账户
        accountDao.updateAccount(source);

//            int i=1/0;

        //2.6更新转入账户
        accountDao.updateAccount(target);
    }
}
