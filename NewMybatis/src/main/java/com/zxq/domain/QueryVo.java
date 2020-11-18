package com.zxq.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/15 11:16
 * 4
 */

    public class QueryVo implements Serializable {
        private User user;
        private List<Integer> ids;

        public QueryVo() {
        }

        public QueryVo(User user, List<Integer> ids) {
            this.user = user;
            this.ids = ids;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public List<Integer> getIds() {
            return ids;
        }

        public void setIds(List<Integer> ids) {
            this.ids = ids;
        }

        @Override
        public String toString() {
            return "QueryVo{" +
                    "user=" + user +
                    ", ids=" + ids +
                    '}';
        }

}