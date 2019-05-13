package com.zh.program.Dao;

import com.zh.program.Entrty.Banner;
import com.zh.program.Entrty.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerDao extends JpaRepository<Banner, Integer> {
}
