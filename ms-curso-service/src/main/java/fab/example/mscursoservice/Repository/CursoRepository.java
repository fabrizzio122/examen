package fab.example.mscursoservice.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import fab.example.mscursoservice.Entity.Curso;

public interface CursoRepository extends JpaRepository<Curso,Integer> {
}
