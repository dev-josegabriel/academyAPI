package br.com.josedev.academyAPI.service;

import br.com.josedev.academyAPI.database.model.AlunosEntity;
import br.com.josedev.academyAPI.database.model.AvaliacoesFisicasEntity;
import br.com.josedev.academyAPI.database.repository.iAlunosRepository;
import br.com.josedev.academyAPI.database.repository.iAvaliacoesFisicasRepository;
import br.com.josedev.academyAPI.dto.AvaliacaoFisicaDto;
import br.com.josedev.academyAPI.exception.BadRequestException;
import br.com.josedev.academyAPI.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacoesFisicasService {

    private final iAlunosRepository alunosRepository;
    private final iAvaliacoesFisicasRepository avaliacoesFisicasRepository;

    public void criarAvaliacaoFisica(AvaliacaoFisicaDto avaliacaoFisicaDto) throws BadRequestException, NotFoundException {
        AlunosEntity aluno = alunosRepository.findById(avaliacaoFisicaDto.getAlunoId())
                .orElseThrow(() -> new NotFoundException("Aluno não encontrado com o ID: " + avaliacaoFisicaDto.getAlunoId()));
        AvaliacoesFisicasEntity avaliacaoFisica = aluno.getAvaliacaoFisica();

        if (avaliacaoFisica != null) {
            throw new BadRequestException("Já existe uma avaliação física para o aluno com ID: " + avaliacaoFisicaDto.getAlunoId());
        }

        avaliacaoFisica = AvaliacoesFisicasEntity.builder()
                .peso(avaliacaoFisicaDto.getPeso())
                .altura(avaliacaoFisicaDto.getAltura())
                .porcentagemGorduraCorporal(avaliacaoFisicaDto.getPercentualGorduraCorporal())
                .build();

        aluno.setAvaliacaoFisica(avaliacaoFisica);
        alunosRepository.save(aluno);
    }

}
