package com.best.team.reditclone.repository;

import com.best.team.reditclone.entity.SubRedit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubReditRepository extends JpaRepository<SubRedit,Long> {
    SubRedit findById(long id);
}
