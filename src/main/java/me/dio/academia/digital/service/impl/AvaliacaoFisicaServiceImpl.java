package me.dio.academia.digital.service.impl;


//Importa a clase Aluno
import me.dio.academia.digital.entity.Aluno;
//Importa a classe AvaliacaoFisica
import me.dio.academia.digital.entity.AvaliacaoFisica;
//Importa a classe do form AvaliacaoFisicaForm
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
//Importa a classe do form AvaliacaoFisicaUpdateForm
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
//Importa a classe do repositorio AlunoRepository
import me.dio.academia.digital.repository.AlunoRepository;
//Importa a classe do repositorio AvaliacaoFisicaRepository
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
//Importa a classe da interface IAavaliacaoFisicaService
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
//Importa a classe Service
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Importa a classe List
import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();


        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);

    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
