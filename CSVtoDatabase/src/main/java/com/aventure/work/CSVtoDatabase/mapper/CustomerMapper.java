package com.aventure.work.CSVtoDatabase.mapper;
import com.aventure.work.CSVtoDatabase.model.Customer;
import org.springframework.data.repository.CrudRepository;
import javax.annotation.Resource;


@Resource
public interface CustomerMapper extends CrudRepository<Customer, Integer> {
}
