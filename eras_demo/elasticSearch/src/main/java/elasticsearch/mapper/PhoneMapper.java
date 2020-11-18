package elasticsearch.mapper;


import elasticsearch.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneMapper extends ElasticsearchRepository<Product, Long> {




    List<Product> findById();

    List<Product> findByPname(String pname);

    List<Product> findByPpriceBetween(double star, double end);


    List<Product> findByPname(String pname, Pageable pageable);
}
