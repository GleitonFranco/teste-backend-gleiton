package com.opovodigital.testebackend.dao;

import com.opovodigital.testebackend.model.Artigo;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

public class ArtigoDao {
    public List<Artigo> artigos;

    public ArtigoDao() {
        this.artigos = new ArrayList<Artigo>();
        this.artigos.add(new Artigo(1L,"Cruzeiro perde e Ceará fica a um empate de se manter na Série A",""));
        this.artigos.add(new Artigo(2L, "Assembleia aprova anistia de créditos tributários do IPVA e Detran", ""));
        this.artigos.add(new Artigo(3L, "Câmara muda texto, estende prazos e limita período de fiscalização", ""));
        this.artigos.add(new Artigo(4L, "Policiais e bombeiros fazem manifestação na Assembleia Legislativa", ""));
        this.artigos.add(new Artigo(5L, "FGTS - Caixa libera saques nesta sexta-feira", ""));
        this.artigos.add(new Artigo(6L, "Prefeitura de Aquiraz prorroga inscrição para seleção com 79 vagas", ""));
        this.artigos.add(new Artigo(7L, "TRE-CE retoma atendimento biométrico; eleitores destacam atendimento rápido", ""));
    }

    public List<Artigo> todos() {
        return this.artigos.stream().sorted(Comparator.comparing(a -> a.getId())).collect(Collectors.toList());
    }

    public Artigo obterPorId(Long id) {
        Optional<Artigo> op = this.artigos.stream().filter( a -> a.getId().longValue() == id.longValue()).findFirst();
        return op.get();
    }

    public void remover(Long id) {
        this.artigos.remove(this.obterPorId(id));
    }

    public void atualizar(Artigo artigo) {
        this.remover(artigo.getId());
        this.artigos.add(artigo);
    }

    public void salvar(Artigo artigo) {
        Long id = this.artigos.stream().map(a -> a.getId()).max(Comparator.naturalOrder()).get();
        artigo.setId(++id);
        this.artigos.add(artigo);
    }
}
