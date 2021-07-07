package saba.kikvidze.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import saba.kikvidze.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {

}

