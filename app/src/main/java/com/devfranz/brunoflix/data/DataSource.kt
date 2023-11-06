package com.devfranz.brunoflix.data

import com.devfranz.brunoflix.models.Movies

class DataSource {

    companion object{

        fun createDataSet() : ArrayList<Movies>{

            val list = ArrayList<Movies>()

            list.add(
                Movies(
                    "Bird Box",
                    "Os eventos de \"Bird Box Barcelona\" se passam paralelamente à história do primeiro filme e, desta vez, acompanhamos a invasão das misteriosas criaturas na cidade espanhola por meio de Sebastián (Mario Casas) e sua filha, Anna (Alejandra Howard), que viajam tentando fugir dos invisíveis monstros letais.\n" +
                            "\n" +
                            "Aos poucos descobrimos que Sebastián esconde um segredo que pode significar a desgraça para os novos sobreviventes que encontra no caminho: Claire (Georgina Campbell), Sofia (Naila Schuberth) e Octavio (Diego Calva). O protagonista é uma espécie de vidente, parecido com Gary, personagem de Tom Hollander do filme original, que acredita que sua missão é expor as criaturas a todos os outros.",
                    "Josh Malerman",
                    "Ação",
                    "https://st1.uvnimg.com/dims4/default/571dca0/2147483647/thumbnail/1024x576%3E/quality/75/?url=http%3A%2F%2Fuvn-brightspot.s3.amazonaws.com%2F02%2Ff5%2F846a5b13462fb23603eb5f6cd872%2Fbird-box-barcelona-filme-0723-1400x800.jpg",
                )
            )
            list.add(
                Movies(
                    "Bad Boys para Sempre",
                    "Os policiais parceiros Mike Lowrey (Smith) e Marcus Burnett (Lawrence) estão de volta em mais uma investigação contra o tráfico de drogas em Miami. A diferença desta para as outras missões da dupla é que Mike e Marcus pensam seriamente em uma aposentadoria após terminarem o serviço. O terceiro título da franquia rendeu nota 6,5 no IMDb e aprovações de 76% (imprensa, selo \"Fresco\") e 96% (audiência) no Rotten Tomatoes.\n" +
                            "\n",
                    "Adil El Arbi e Bilall Fallah",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/p-c_Mdnt1kaDoie2Ehw0qv86wQs=/0x0:1440x750/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2023/j/G/2Q8rABSCaPrgw8VIF9SQ/bad-boys-para-sempre-justwatch-techtudo.jpg"
                )
            )

            list.add(
                Movies(
                    "Resgate",
                    "Tyler Rake (Helmsworth) é um mercenário que, no passado, foi um operador das Forças Especiais da Austrália. Agora atuando no mercado clandestino, Rake deve resgatar com vida o filho de um poderoso chefe do tráfico em Bangladesh. No entanto, a missão pode gerar conflitos com outro grupo criminoso rival responsável pelo sequestro. O título exclusivo da Netflix obteve nota 6,7 no IMDb e aprovações de 67% (imprensa) e 70% (audiência) no Rotten Tomatoes.",
                    "Sam Hargrave",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/-MHIV4UJqYN8YUb8c9VpnAucauw=/0x0:1479x602/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2023/o/7/BuSoAiRUqZOV6hIeczJg/extraction-imdb-techtudo.jpg",
                )
            )

            list.add(
                Movies(
                    "Luther: O Cair da Noite",
                    "John Luther (Elba) é um policial implacável que não mede esforços para resolver crimes. No entanto, ele está preso em um presídio de segurança máxima. Após fugir do local, sua principal missão é capturar o serial killer milionário David Robey (Serkis). Na votação do público, Luther: O Cair da Noite obteve nota 6,4 no IMDb. Já no Rotten Tomatoes, as aprovações são de 67% (imprensa) e 85% (audiência).",
                    "Jamie Payne",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/AJPA4PZf5tdZnza2MHNY3ykLeG4=/0x0:1000x643/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2022/L/9/DegqF9TnC26b0gerVPeQ/luther-imdb-techtudo.jpg",
                )
            )

            list.add(
                Movies(
                    "Operação Fronteira",
                    "Ex-agentes de grupos especiais do exército americano se juntam para roubar a fortuna de um chefão do narcotráfico na América do Sul. Porém, a ação do grupo desencadeia um enorme conflito no subcontinente. A ação de roubo obteve nota 6,4 no IMDb, médias de 61 (crítica) e 6.8 (público) no Metacritic, e aprovações de 70% (imprensa, selo \"Fresco\") e 55% (audiência) no Rotten Tomatoes.",
                    "J. C. Chandor",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/VUcTaFJtYvltgJbe3WtL73ZNMQc=/0x0:1440x750/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2023/w/o/HMrBBQSYAHx68xtcEk7w/triple-frontier-justwatch-techtudo.jpg",
                )
            )

            list.add(
                Movies(
                    "Kill Boksoon",
                    "Gil Bok-Soon (Jeon Do-Yeon) é uma assassina de aluguel com 100% de aproveitamento em suas missões. Para ela, a maior dificuldade é ser mãe solteira de Gil Jae-yeong (Kim Si-a), uma adolescente que sequer desconfia do trabalho de seu trabalho. Um conflito de interesses na organização criminosa onde a assassina trabalha pode pôr em risco a sua vida e da filha. Kill Boksoon obteve nota do público de 6,6 no IMDb, e aprovações de 79% (crítica) e 84% (audiência) no Rotten Tomatoes.",
                    "Byun Sung-hyun",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/b-cbby_CNWjTsudweqVcnVqqlVM=/0x0:1422x750/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2023/y/P/7dsqmtQKaAwdH0OH74wA/kill-boksoon-netflix-techtudo.jpg",
                )
            )

            list.add(
                Movies(
                    "The Old Guard",
                    "A trama foca em um grupo de mercenários imortais liderado por Andy (Teron). Após séculos atuando secretamente pela segurança dos mortais, uma nova missão pode expor negativamente suas habilidades e colocá-los em risco. A adaptação tem nota 6,6 no IMDb, além das aprovações de 80% (imprensa, selo \"Fresco\") e 70% (público) no Rotten Tomatoes.",
                    "Greg Rucka",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/imZhD7N7nbggH5_C0QCUUNQ0ZS4=/0x0:1440x750/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2023/F/n/YAY3UuTNyjfxMG8qBwYw/a-velha-guarda-justwatch-techtudo.jpg",
                )
            )

            list.add(
                Movies(
                    "Vingança e Castigo",
                    "No velho oeste do século 19, o pistoleiro Nat Love (Majors) lidera um grupo que rouba criminosos. Sua meta muda quando descobre que um antigo desafeto, Rufus Buck (Elba), fugiu da prisão. Agora, Love quer se vingar de Buck por ter matado seus pais. O faroeste afro-americano obteve nota 6,6 no IMDb e aprovações de 88% (imprensa, selo \"Fresco\") e 93% (público) no Rotten Tomatoes.",
                    "Jeymes Samuel",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/rZth-zwyst810JqHkzJYsu7eKh0=/0x0:1422x750/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2023/u/t/Yhu00mSWKebUuwtPjU4A/vinganca-castigo-netflix-techtudo.jpg",
                )
            )

            list.add(
                Movies(
                    "Posto de Combate",
                    "O posto avançado Keating é composto por soldados americanos em solo afegão. Entre eles, está o primeiro tenente Benjamin Keating (Bloom), responsável por liderar o posto. Ao seu lado, os sargentos Clint Romesha (Eastwood) e Ty Carter (Jones) farão de tudo para manter a equipe a salvo dos ataques do Talibã. O drama biográfico conquistou nota 6,8 no IMDb, além das aprovações de 92% (imprensa, selo \"Fresco\") e 81% (audiência) no Rotten Tomatoes.",
                    "Rod Lurie",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/EccKmq0XN3HNFqlF4Yz2duzejOQ=/0x0:1440x750/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2023/B/h/0XMAzqR8WNWB8GqkKexw/posto-de-combate-justwatch-techtudo.jpg",
                )
            )

            list.add(
                Movies(
                    "Enola Holmes",
                    "No filme inicial, Enola Holmes (Brown) é a irmã mais nova dos investigadores Sherlock (Cavill) e Myrock (Claflin). Ela quer ser uma detetive como eles, mas não tem o apoio da família. Porém, quando sua mãe desaparece misteriosamente, Enola tem a chance de mostrar seu valor. O suspense e aventura obteve nota 6,6 no IMDb, médias de 68 (imprensa) e 2.8 (público) no Metacritic, além das aprovações de 91% (crítica) e 71% (audiência) no Rotten Tomatoes.",
                    "Nancy Springer",
                    "Ação",
                    "https://s2-techtudo.glbimg.com/ZZEncTqzLmzv7Ki0rhAPmoqq0XE=/0x0:3840x2160/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2023/H/8/GEZl5BQVWGFmkGUXFOQA/enola-holmes-rt-techtudo.jpg",
                )
            )

            list.add(
                Movies(
                    "Barbie",
                    "Vivendo na Barbielândia com outras Barbies e Kens, a vida da boneca é verdadeiramente cor-de-rosa. Todos os dias são perfeitos e não há problemas.\n" +
                            "\n" +
                            "Até que de repente Barbie começa a ter pensamentos estranhos e se dá conta que o mundo é muito maior do que sua bolha.",
                    "Greta Gerwig",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/barbie-filme.jpg"
                )
            )

            list.add(
                Movies(
                    "O Peso do Talento",
                    "Com Nicolas Cage como personagem e ator principal da trama, o longa-metragem fala sobre a fama e a popularidade no mundo atual. Sentindo que a sua carreira estagnou, a estrela aceita um convite inusitado para poder pagar as contas. É aí que a sua vida dá uma reviravolta.",
                    "Tom Gormican",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/peso-do-talento-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "O Homem de Toronto",
                    "Combinando comédia e ação, o filme acompanha Teddy, um homem que leva uma vida comum, até se confundir e entrar no apartamento errado. Devido a esse acaso, ele acaba se envolvendo com um assassino perigoso, conhecido como Homem de Toronto.",
                    "Patrick Hughes",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/homem-de-toronto-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "Free Guy",
                    "Guy leva uma rotina extremamente chata e solitária, trabalhando como caixa de banco. Sua realidade se transforma quando ele descobre que é um mero personagem não-jogador (NPC) num videogame chamado Free City. A partir daí, ele passa a controlar a narrativa e tem uma missão: salvar o mundo.",
                    "Shawn Levy",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/free-guy-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "De Férias da Família",
                    "O protagonista da história é um pai de família que aproveita para relaxar e se divertir, enquanto a esposa e os filhos viajam. Aí, ele decide reencontrar o seu melhor amigo, com quem acaba se envolvendo em confusões inacreditáveis.",
                    "John Hamburg",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/de-ferias-da-familia-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "Deadpool ",
                    "O longa-metragem acompanha o destino do super-herói mais bem-humorado da Marvel Comics. Wade Wilson é um antigo militar que ganha a vida como mercenário até descobrir que está com um câncer terminal. Depois de ser submetido a um tratamento experimental, ele ganha superpoderes e prepara a sua vingança.",
                    "Tim Miller",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/deadpool-2016-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "Anjos da Lei",
                    "Inspirado na série de TV com o mesmo título, o filme segue a carreira de Greg e Morton, dois policiais novatos que se conheceram durante o ensino médio. Agora, a primeira grande missão dos dois é regressar ao colégio, disfarçados de estudantes, para desmontar uma rede criminosa.",
                    "Phil Lord e Christopher Miller",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/anjos-da-lei-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "Minha Mãe é Uma Peça 3",
                    "Dona Hermínia é, sem dúvida, uma das mães mais engraçadas da ficção nacional. Desta vez, a vida da protagonista se complicou: a filha está grávida, o filho vai casar e o ex-marido se mudou para a região. Perante tantas emoções, ela percebe que está na hora de se reinventar.",
                    "Susana Garcia",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/minha-mae-e-uma-peca-3-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "Superbad",
                    "Evan e Seth são dois adolescentes que estão quase terminando o ensino médio. Com a ajuda de Foggel, eles criam um plano para conquistar as suas \"crushes\" e comprar bebidas alcoólicas com documentos falsos.",
                    "Greg Mottola",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/superbad-filme-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "Queime Depois de Ler",
                    "Chad e Linda são dois funcionários de uma academia que acham um CD que contém informações confidenciais de um antigo agente da CIA. É então que eles decidem chantageá-lo, pedindo uma quantia de dinheiro para devolver o objeto.",
                    "Ethan e Joel Coen",
                    "Comédia",
                    "https://cdn.culturagenial.com/imagens/queime-depois-de-ler-cke.jpg"
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Documentários",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Infantil",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Religioso",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )

            list.add(
                Movies(
                    "",
                    "",
                    "",
                    "Aventura",
                    ""
                )
            )





            return list

        }

    }

}