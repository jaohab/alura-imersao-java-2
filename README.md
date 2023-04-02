# IMERSÃO JAVA - Alura

Repositorio dos conteúdos abordados durante o curso IMERSÃO JAVA 2 da Alura entre os dias 27/03/23 à 31/03/23.

***

## ⚪ Conteúdo

***

**Aula 01** - Consumindo uma API de filmes com Java  
**Aula 02** - Gerando figurinhas para WhatsApp  
**Aula 03** - Ligando as pontas, refatoração e orientação a objetos  
**Aula 04** - Criando nossa própria API com Spring  
**Aula 05** - Publicando nossa API no Cloud  

***

## ⚪ Descrição

***

### ✅ **Aula 01 - Consumindo uma API de filmes com Java**

> Nesta primeira aula, vamos construir uma aplicação do zero para consumir a API do IMDb e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação sem usar nenhuma biblioteca externa.

#### **Links - 01**

Referência: [Os 250 melhores filmes de acordo com a classificação do IMDB](https://www.imdb.com/chart/top/)  
[Documentação da API do IMDB.](https://imdb-api.com/api)  
[Documentação da classe HttpRequest do pacote java.net.http](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html)  
[Classe pronta que utiliza Expressões Regulares para fazer parse de um JSON](https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3)  
[Biblioteca Jackson, que faz parse de JSON](https://github.com/FasterXML/jackson)  
[Site que ajuda a entender Expressões Regulares](https://regex101.com/)  

#### **Material complementar - 01**

Artigo: [O que é JSON?](https://www.alura.com.br/artigos/o-que-e-json)  
Artigo: [Decore o terminal com cores e emojis](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis)

#### **Desafios desta aula - 01**

1. ✅ **––** Consumir o endpoint de filmes mais populares da API do IMDB.  
Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.  
2. ✅ **––** Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!  
3. ⛔ **––** Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente.  

#### **Instabilidade da API do IMDb**

Caso a API do IMDb esteja instável ou fora do ar, você pode utilizar os seguintes endereços alternativos:

<https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json>
<https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json>
<https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json>
<https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json>  

#### **Resultado do Desafio - 01**

![Resultado Aula 1](resultado/resultado_1.png)  

***
&nbsp;
***

### ✅ **Aula 02 - Gerando figurinhas para WhatsApp**

> Nesta segunda aula vamos criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos.

#### **Links - 02**

[Documentação javax.imageio](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html)  
[Documentação BufferedImage](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html)  
[Documentação classe Graphics2D](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html)  
[Documentação InputStream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html)  

#### **Material complementar - 02**

[Java Polimorfismo: entenda herança e interfaces](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo)  
[Java e Orientação a Objetos](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io)  

#### **Desafios desta aula - 02**

1. ✅ **––** Criar diretório de saída das imagens, se ainda não existir.
2. ✅ **––** Centralizar o texto na figurinha.
3. ✅ **––** Colocar outra fonte como a Comic Sans ou a Impact.
4. ✅ **––** Colocar contorno (outline) no texto da imagem.
5. ✅ **––** Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha e fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.  
**Observação:** Substitui a foto por emojis.
6. ✅ **–– DESAFIO PESSOAL ––** Adicionar função de redimencionar as imagens antes de gerar os stickers para padronizar o resultado.

#### **Resultado do Desafio - 02**

![Resultado Aula 2](resultado/resultado_2.png)  

***
&nbsp;
***

### ✅ **Aula 03 - Ligando as pontas, refatoração e orientação a objetos**

> Chegou o momento de pegarmos os filmes do IMDb e gerar figurinhas com os pôsteres, aproveitando para melhorar nosso código com as refatorações necessárias para torná-lo mais flexível e fácil de entender.

**Observação:** Os conteúdos das aulas 01 e 02 foram movidas para a pasta *discontinued* para servir de referencia e não se misturar com os novos códigos da refatoração.

#### **Links - 03**

[Documentação APIs da NASA](https://api.nasa.gov/)  
[API da Foto Astronômica do dia da NASA](https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY)  
Artigo: [Como não aprender Java e Orientação a Objetos: getters e setters](https://www.alura.com.br/artigos/nao-aprender-oo-getters-e-setters)  
Livro: [Design Patterns](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)  
Livro: [Refactoring](https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672)  

#### **Material complementar - 03**

Artigo: [Como não aprender Java e Orientação a Objetos: herança](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca)  
Podcast Hipsters.tech [Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453)  
Podcast Hipsters.tech [Design Patterns](https://www.alura.com.br/podcast/design-patterns-hipsters-206-a345)  
Podcast Hipsters.tech [SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649)  
Livro: [Desbravando SOLID](https://www.casadocodigo.com.br/products/livro-desbravando-solid)  

#### **Desafios desta aula - 03**

1. ✅ **––** Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16.  
2. ⛔ **––** Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP.  
3. ⛔ **––** Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra.  
4. ⛔ **––** Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado.  

#### **Instabilidade da API da NASA**

Caso a API da NASA fique instável, use as seguintes URLs, que terão os mesmos dados usados na aula:  

<https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD.json>

Além disso, deixamos uma URLs com imagens fantásticas do James Webb Space Telescope, como o primeiro deep field desse fantástico telescópio!  

<https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD-JamesWebbSpaceTelescope.json>

#### **Resultado do Desafio - 03**

***
&nbsp;
***

### ✅ **Aula 04 - Criando nossa própria API com Spring**

> Agora vamos construir uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.

#### **Links - 04**

[Documentação Spring Framework](https://spring.io/)  
[Spring Initializr](https://start.spring.io/)  
[Download Maven](https://maven.apache.org/download.cgi)  
[Download Postman](https://www.postman.com/)  
[Registro MongoDb Atlas](https://www.mongodb.com/cloud/atlas/register)  
GitHub: [Logos das linguagens de programação](https://github.com/abrahamcalf/programming-languages-logos)  
Artigo: [Pack de stickers da Alura para Whatsapp e Telegram](https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram)  

#### **Material complementar - 04**

[Maven: gerenciamento de dependências e build de aplicações Java](https://www.alura.com.br/conteudo/maven-gerenciamento-dependencias-build-aplicacoes-java)  
[O que é REST?](https://www.youtube.com/watch?v=weQ8ssA6iBU&ab_channel=AluraCursosOnline)  
[Introdução ao Postman](https://www.youtube.com/watch?v=op81bMbgZXs&ab_channel=AluraCursosOnline)  
Podcast Hipsters.Tech [MongoDB](https://www.hipsters.tech/mongodb-hipsters-ponto-tech-305/)  
Hipters.Tube [O que é SQL e NoSQL?](https://www.youtube.com/watch?v=aure5d3B88g&ab_channel=AluraCursosOnline)  
Artigo: [Conceito e fundamentos sobre REST](https://www.alura.com.br/artigos/rest-conceito-e-fundamentos)  
Artigo: [Spring: Conheça esse framework Java](https://www.alura.com.br/artigos/spring-conheca-esse-framework-java)  

#### **Desafios desta aula - 04**

1. ⛔ **––** Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada.  
2. ⛔ **––** Devolver a listagem ordenada pelo ranking.  
3. ⛔ **––** Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST.  

#### **Resultado do Desafio - 04**

***
&nbsp;
***

### ✅ **Aula 05 - Publicando nossa API no Cloud**

> Para fechar com chave de ouro, vamos tornar nossa aplicação acessível por qualquer pessoa, fazendo o deploy na nuvem. Além disso, vamos gerar figurinhas a partir do conteúdo dessa nossa API.

#### **Links - 05**

[Documentação Docker](https://docs.docker.com/get-started/overview/) - Plataforma de containers utilizada para construir a imagem cujo deploy foi feito no Fly.io.  
[Docker Hub](https://hub.docker.com/) - Repositório central de imagens que podem ser usadas para executar containers de diferentes tecnologias e ferramentas.  
[Fly.io](https://fly.io/) - PaaS (plataforma como serviço) utilizado nesta segunda edição da Imersão Java. Requer cartão de crédito. É fundamental entender a precificação e as [quotas gratuitas](https://fly.io/docs/about/pricing/#free-allowances).  
[Heroku](https://www.heroku.com/) - PaaS utilizado na primeira edição da Imersão Java. É importante entender a [precificação do Heroku](https://www.heroku.com/pricing).  
[Documentação Oracle Cloud](https://docs.oracle.com/pt-br/iaas/Content/home.htm)  
Artigo: [Como elaborar um bom arquivo Readme para os seus projetos](https://www.alura.com.br/artigos/escrever-bom-readme)  

#### **Material complementar - 05**

[Dev em T: especialista x generalista](https://www.alura.com.br/dev-em-t)  
Artigo: [Começando com Docker](https://www.alura.com.br/artigos/comecando-com-docker)  
Artigo: [Heroku, Vercel e outras opções de Cloud como plataforma](https://www.alura.com.br/artigos/heroku-vercel-outras-opcoes-cloud-plataforma)  
Podcast Hipters.Tech [Integração Contínua, Deploy Contínuo e Github Actions](https://www.alura.com.br/podcast/hipsterstech-integracao-continua-deploy-continuo-e-github-actions-hipsters-213-a335)  
[Pesquisa da JetBrains, sobre o ecossistema Java em 2021](https://www.jetbrains.com/lp/devecosystem-2021/java/)  

#### **Fazendo deploy da imagem da aula**

Para que você não precise instalar o Docker, criar um Dockerfile e fazer o build de uma imagem Docker com sua aplicação na sua própria máquina, disponibilizamos a imagem gerada na aula no seguinte link: <https://hub.docker.com/repositories/jacquelineoliveira>

O deploy no Fly.io pode ser feito com os seguintes passos:

1. Instale o comando [flyctl](https://fly.io/docs/hands-on/install-flyctl/) na sua máquina
2. Em um Terminal, execute o comando: flyctl launch --image jacquelineoliveira/linguagensapi:latest
3. Configure o endereço do seu MongoDB com o comando: flyctl secrets set "SPRING_DATA_MONGODB_URI=mongodb+srv://seuusuario:suasenha@clusterAbc.xvcnx.mongodb.net/aluraDb?retryWrites=true&w=majority" (não deixe de definir o usuário e senha corretos)

***
