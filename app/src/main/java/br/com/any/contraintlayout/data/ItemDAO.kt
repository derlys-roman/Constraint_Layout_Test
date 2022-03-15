package br.com.any.contraintlayout.data

import br.com.any.contraintlayout.model.ItemSources

class  ItemDAO {

    private val itens: ArrayList<ItemSources> = arrayListOf(
        ItemSources(
            "São Paulo",
            "@drawable/sao_paulo_sp",
            "2 dias",
            "R$ 243,99"
        ),
        ItemSources(
            "Belo Horizonte",
            "@drawable/belo_horizonte_mg",
            "3 dias",
            "R$ 421,50"
        ),
        ItemSources(
            "Recife",
            "@drawable/recife_pe",
            "4 dias",
            "R$ 754,20"
        ),
        ItemSources(
            "Rio de Janeiro",
            "@drawable/rio_de_janeiro_rj",
            "6 dias",
            "R$ 532,55"
        ),
        ItemSources(
            "Salvador",
            "@drawable/salvador_ba",
            "5 dias",
            "R$ 899,99"
        ),
        ItemSources(
            "Foz do Iguaçu",
            "@drawable/foz_do_iguacu_pr",
            "1 dia",
            "R$ 289,90"
        ),
    )

    fun getAll(): ArrayList<ItemSources> {
        return itens
    }
}