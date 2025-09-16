package pe.edu.fab.mscurso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.fab.mscurso.Entity.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Integer> {
}
