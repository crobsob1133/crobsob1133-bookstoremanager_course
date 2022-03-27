package com.carlosrobson.bookstoremanager.publishers.repository;

import com.carlosrobson.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
