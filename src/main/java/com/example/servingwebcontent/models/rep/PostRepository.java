package com.example.servingwebcontent.models.rep;
import com.example.servingwebcontent.models.Post;
import org.springframework.data.repository.CrudRepository;





public interface PostRepository extends CrudRepository <Post,Long> {
}
