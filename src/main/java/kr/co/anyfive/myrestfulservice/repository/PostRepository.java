package kr.co.anyfive.myrestfulservice.repository;

import kr.co.anyfive.myrestfulservice.bean.Post;
import kr.co.anyfive.myrestfulservice.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
