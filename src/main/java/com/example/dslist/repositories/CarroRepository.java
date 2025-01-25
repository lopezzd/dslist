package com.example.dslist.repositories;

import com.example.dslist.entities.Carro;
import com.example.dslist.projections.CarroMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    @Query(nativeQuery = true, value = """
        SELECT
                    carros.id, carros.modelo, carros.marca, carros.img_url AS imgUrl, carros.descricao_curta AS descricaoCurta, tb_belonging.position
        FROM
                    carros
        INNER JOIN
                    tb_belonging
        ON
                    carros.id = tb_belonging.carro_id
        WHERE
                    tb_belonging.list_id = :listId
        ORDER BY
                    tb_belonging.position
			""")
    List<CarroMinProjection> searchByList(Long listId);
}

/*
SELECT
            CARROS.id, CARROS.modelo, CARROS.marca, CARROS.img_url AS imgUrl, CARROS.descricao_curta AS descricaoCurta, tb_belonging.position
FROM
            CARROS
INNER JOIN
            tb_belonging
ON
            CARROS.id = tb_belonging.carro_id
WHERE
            tb_belonging.list_id = 1
ORDER BY
            tb_belonging.position
*/