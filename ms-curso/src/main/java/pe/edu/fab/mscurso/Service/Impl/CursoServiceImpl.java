package pe.edu.fab.mscurso.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.fab.mscurso.Entity.Curso;
import pe.edu.fab.mscurso.Repository.CursoRepository;
import pe.edu.fab.mscurso.Service.CursoService;

import java.util.List;
import java.util.Optional;
@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> buscarPorId(Integer id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Curso guardar(Curso curso) {return cursoRepository.save(curso);
    }

    @Override
    public Curso actualizar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void borrarPorId(Integer id) {
        cursoRepository.deleteById(id);
    }
}
