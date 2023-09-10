#### 08/09/2023

Curso de Android parte 2: avançando com listeners, menu e UI

@01-Carregando aluno no formulário

@@01
Introdução

Opa, pessoal. Beleza? Eu sou o Alex Felipe, instrutor aqui da Alura, e vou apresentar para vocês a segunda parte do curso de fundamentos do Android. Isso significa que daremos continuidade ao mesmo projeto que foi desenvolvido no primeiro curso de fundamentos do Android, portanto, eu vou exigir que você tenha todo o conhecimento que foi visto dentro do primeiro curso, dado que nesse curso a gente vai avançar com o que já foi implementado. Então, dada essa ideia de avanço, o que a gente vai fazer aqui durante esse curso? A nossa ideia, a princípio, vai ser completar um CRUD, que é justamente aquela ideia de poder inserir, poder pegar os dados, fazer atualizações e também remover aqui os nossos dados. No primeiro curso, o que a gente conseguiu fazer? A gente conseguiu fazer a nossa listagem, que seria justamente a seleção, e a gente conseguiu também adicionar alunos. Por exemplo, eu vou adicionar o Gui e a gente consegue fazer isso sem nenhum problema. Conseguimos fazer isso tudo no primeiro curso. Agora, nesse curso, a gente vê que existe uma necessidade, por exemplo, de poder editar essas informações, dado que, de repente, o Gui, você também queria colocar um sobrenome. Então, você vai ter a possibilidade agora, tocando aqui no aluno, então colocando a informação que você espera, que, no caso, é o Gui Silveira que está participando com a gente. A gente vai lá e salva de novo. A gente vai aprender como a gente pode estar fazendo isso, seja essa técnica de clicar no aluno específico, seja essa técnica de mandar em formulário e também editar. Percebe que agora o nosso formulário vai ter essa capacidade flexível de tanto inserir aluno como também editá-lo. Isso a gente vai acabar aprendendo durante o curso. Claro, para poder remover a gente sabe que também precisa fazer uma ação, dado que gente já usa o click, o que a gente poderia fazer? Para isso, a gente vai aprender que, aqui no Android, existem outros tipos de ações que são comuns, como é o caso dessa ação que a gente clica, segura e pressiona aqui o elemento. Essa técnica a gente conhece como “clique longo” aqui como desenvolvedor, tudo bem? A gente vai aprender como a gente pode estar explorando ela justamente para dar essa opçãozinha que eu estou mostrando para você, que é esse menuzinho, que é conhecido como menu de contexto. A gente vai ver que ele é referente aos nossos menus de botão direito dos sistemas operacionais. Quando a gente toca em um botão direito, a gente tem a equivalência nesse menu de contexto. Ambos são menus de contexto e a gente vai ver como a gente pode implementar aqui no Android. Como a gente pode ver aqui, nosso menu de contexto, a gente tem a opção de remover. Se a gente tocar aqui em “remover”, ele vai lá e remove. Da mesma maneira, se a gente não tocar na opção, ele vai lá e não remover. A gente vai ver que isso se faz necessário justamente para que os nossos usuários, que usam o nosso aplicativo, ele tenha consciência suficiente do quão impactante vai ser aquela opção, tudo bem? E a gente vai ver como a gente pode estar lidando com isso e deixando de uma maneira ideia para o nosso usuário. Claro, também como a gente pode ver aqui, o nosso formulário teve uma certa diferença: antes a gente tinha um botãozinho aqui embaixo e agora a gente tem esse menuzinho aqui em cima, que é um menu de opções. Então, perceba que, durante esse curso a gente vai explorar um pouquinho mais sobre essa ideia de menus. Como a gente pode estar criando menus, quais são os cuidados que a gente precisa ter e qual é o benefício de utilizá-los, afinal, por que a gente migrou de um botão para esse menu? A gente vai entender que isso pode ser beneficente dependendo do dispositivo, como é o caso do tamanho do dispositivo, quanto da tela que vai ocupar, entre outros detalhes. Perceba que a gente vai realmente avançar no conteúdo. Vão ser novos desafios que a gente vai acabar encarando, vão ser novos detalhes que vão ser comuns no seu dia-a-dia, independente do seu projeto Android. Eu espero que você esteja contente com a proposta do curso, eu espero que você esteja animado para começar a fazer e eu conto com a sua participação. Até já.

@@02
Atualização do conteúdo

Atualização do conteúdo
Desde a gravação do curso, houve algumas mudanças em relação ao Android Studio e SDK do Android. O curso, gravado em Janeiro de 2019, utilizou a versão 3.2.1 do Android Studio e o SDK 28 do Android.

Considerando as mudanças ocorridas nesse período, atualizamos o conteúdo do curso com base no que temos hoje. (Janeiro de 2021)

Mudanças no projeto
Isso significa que o projeto, disponibilizado no início das aulas e no final do curso, foi atualizado. Na atualização migramos para a API 30 (Android 11) e migramos as bibliotecas para utilizar o AndroidX (mencionado durante o curso) em vez do Android support.

Mudanças no ambiente de desenvolvimento
Agora, temos a versão 4.1 do Android Studio disponível. A revisão e a atualização do conteúdo foram baseadas nesta versão do AS, portanto, você pode utilizar a versão 4.1 sem problemas.

Se preferir, você pode usar uma versão mais recente, caso esteja disponível.
Mudanças no conteúdo do curso
Quando ocorrem essas mudanças, que são diferentes do conteúdo do curso, é muito comum duvidarmos e questionarmos se o que está sendo ensinado no curso é válido para o momento atual.

Não se preocupe! O objetivo da avaliação é manter o conteúdo atualizado sem impactar na sua experiência durante os estudos. É válido ressaltar que, devido à atualização, há mudanças visuais no AS.

Nos casos em que a diferença for muito grande do que é visto em vídeo, no exercício seguinte serão apresentadas as instruções necessárias.

No geral, mudanças não são algo ruim, muito pelo contrário! Elas mostram que o Android framework e o AS estão em constante evolução e isso é excelente, pois indica uma melhoria constante :)

Código-fonte com as mudanças
Caso tenha interesse em verificar todas as mudanças na atualização, confira o commit de atualização do projeto final.

Se tiver alguma dúvida sobre as mudanças, fique à vontade em entrar em contato com a gente.

https://github.com/alura-cursos/fundamentos-android-parte-2/commit/aba3a1c91e7518bc7b7f012efc7dda6c095ba31a

@@03
Orientações iniciais e organização do curso

Pré-requisitos
Neste curso, esperamos que você já tenha todo o conhecimento ensinado no primeiro curso de fundamentos de Android.

Caso você não tenha feito o curso, mas acredita que possa começar a partir daqui, fique à vontade para continuar, porém, se tiver algum conteúdo que não for explicado com tanta atenção, muito provavelmente é porque já foi explicado em um desses cursos. De qualquer forma, você pode entrar em contato com a gente por meio do fórum.

Como o curso está organizado
Cada aula vai ter vídeos e exercícios, sendo que cada vídeo vai manter, pelo menos, um exercício.

Esse é um curso classificado como intermediário, isso significa que alguns exercícios não serão tão passo a passo como foi no primeiro curso. Mas não se preocupe, todas as orientações necessárias serão apresentadas.

Fique à vontade para primeiro assistir a aula, prestar atenção no conteúdo, e depois executar o que foi feito em aula apenas no exercício.

Se preferir executar as etapas junto com o instrutor, fique à vontade, porém, saiba que daremos todo auxílio necessário nos exercícios. Recomendamos fortemente primeiro assistir a aula com atenção para depois praticar :)

https://cursos.alura.com.br/course/android-sua-primeira-app-mobile

@@04
Baixando projeto inicial

Neste curso continuaremos com o projeto desenvolvido no primeiro curso de fundamentos de Android. Caso você tenha feito o projeto, pode continuar com ele sem nenhum problema. Caso contrário, você pode baixar o projeto inicial e abri-lo no Android Studio.
Para abrir o projeto a partir do arquivo baixado, faça a extração do zip para um local onde costuma deixar seus projetos.

Então, na tela inicial do Android Studio, clique em Open an existing Android Studio project. Nesse instante vai abrir um explorador de arquivos, encontre o projeto que foi extraído, então clique em OK.

Para abrir o projeto no AS 4.1, utilize a opção Open an Existing Project ao invés de Open an existing Android Studio project.
Nesse instante, o Android Studio vai rodar algumas tasks do Gradle para configurar o projeto, então aguarde a finalização. Depois que terminar, execute em um dispositivo e veja se o App funciona.

https://github.com/alura-cursos/fundamentos-android-parte-2/archive/projeto-inicial.zip

@@05
Encontrando erros com o logcat

Atualmente o nosso app é capaz tanto de listar como também cadastrar alunos, porém se a gente adicionou o aluno com alguma informação que a gente não espera ou se, de repente, a gente quer adicionar informações a esse aluno, atualmente a gente não tem essa capacidade, dado que o nosso aplicativo não permite editar os nossos alunos, portanto agora para possibilitar mais opções para o nosso usuário, a gente vai começar a implementar essa feature de uma tal maneira que vai facilitar a edição dessas informações quando for necessário, está bom? Então vamos lá. Considerando aí as abordagens que a gente já conheceu no curso anterior de android o que é que a gente pode estar fazendo para poder começar a implementar esse tipo de funcionalidade, para isso a gente precisa ali começar com uma ação, certo? Como, por exemplo, para cadastrar a gente clica aqui no nosso floating action button e ele abre o formulário para gente colocar o novo aluno, bacana. Só que agora a gente precisa editar, então a gente tem que ter uma ação exatamente no momento que a gente quer editar ali um aluno no próprio aluno, então aqui, nessa caixinha aqui do aluno, certo, a gente também precisar adicionar agora um listener de clique, que aí dessa maneira a gente vai ter a capacidade de adicionar um comportamento novo que vai permitir a edição. Então vamos trabalhar primeiro com o listening e vamos ver o que acontece para poder implementar aqui esse listener, está bom. Então vamos lá, como a gente já viu, para adicionar o listening a gente precisar setar esse listening a partir do setOnClickListener. Então vamos voltar lá na nossa activity, crtl n para entrar numa classe, lista alunos activity, e agora aqui dentro dela a gente precisa achar, por exemplo, o método no qual ele busca ali a referência ali da nossa ListView para que então a gente set o listener, para isso a gente já sabe que a gente está ali no nosso onResume e dentro do onResume a gente tem o configura lista, aí aqui dentro do configura lista a gente pega a referência dele que a gente chamamos aqui de lista de alunos. Então depois que a gente seta o adapter agora a gente vai setar o nosso listener, para isso a gente chama aqui a referência lista de alunos.setOnClickListener. A gente já sabe que a gente vai implementar aqui via classe anônima com o nosso View.OnClickListener, bacana. E aqui a gente tem o nosso OnClick que representa ali a ação que vai ser executada quando o clique acontecer, para a gente ver se realmente está funcionando, certo, a gente pode estar colocando aqui um Toast como a gente fez ali anteriormente no nosso floating action button. Então aqui eu coloco um Toast, a gente vai usar aquele templete que ele já oferece para a gente, ele já completa o que ele consegue completar, aí na parte aqui da String vai sair a mensagem, a gente pode colocar alguma coisa diferente para identificar que é o click do nosso ListView. Então click do ListView, beleza? Bacana. Aí eu só vou estender um pouquinho o código para ficar mais fácil de ver, dá uns enters aqui nesses argumentos para ficar também fácil de ver o código numa única view aqui sem ter que ficar fazendo o init. E agora que a gente fez essa implementação a gente pode testar o nosso aplicativo para ver o que acontece, está bom. Para isso o que é que a gente vai fazer? A gente vai executar aqui, vou escolher o emulador que já está de pé e quando ele terminar aqui a gente vai ver o que vai acontecer, está bom? Nesse primeiro momento eu quero aguardar até o final para mostrar uma coisa nova para vocês. Então vamos lá, a gente está aguardando, ele executou, ele tentou abrir e percebe que ele vai tentar abrir, mas não consegue, esse é realmente o comportamento novo que eu quero mostrar para vocês, está bom? Eu vou executar de novo e vocês vão ver acontecendo. Então executando aqui de novo, vamos ver o que acontece, ele vai tentar executar tudo bonitinho e ele vai abrir ali o aplicativo e ele vai sair, tudo bem. O que é que significa isso? Veja que ele até apareceu essa mensagem nova falando que o agenda, que é o nosso aplicativo, ele está se mantendo de uma maneira que ele está sempre ali parando, tudo bem, e ele está falando: “Olha, você quer fechar essa aplicativo?”, sim, a gente quer fechar nesse momento e agora a gente vai começar a entender o que isso significa. Bom, cada vez que a gente está executando aqui o nosso aplicativo a gente sabe que no momento que ele tudo funciona realmente ele vai aparecer ali a tela, a gente vai ter as interações esperadas, porém vai existir situações nas quais algum comportamento que a gente quer que funcione ele não vai funcionar e nessa situação que ele não vai funcionar ele vai lançar aquelas famosas exceções do Java fazendo com que o nosso aplicativo quebre, que foi exatamente o que aconteceu aqui, tudo bem. Então quando o nosso aplicativo ele quebra ele vai tentar executar e ele vai lá e fecha automaticamente, é dessa maneira que o android acaba funcionando aqui como sistema operacional para controlar aqui os aplicativos. Então se tiver uma exceção ele vai lá e vai quebrar o aplicativo. Vai ser muito comum também você escutar que nesse tipo de situação vai ser chamado de crash do aplicativo ou crash do app, então toda vez que você escutar: “O aplicativo ele crashou” ou algo do gênero é justamente essa ideia de que o aplicativo quebrou, teve algum problema que não foi tratado muito bem ou então o código mal escrito entre outras possibilidades, está bom. Mas agora vem a questão: como que a gente pode identificar o problema que aconteceu, certo? Dada as abordagens que a gente viu nesse momento, para isso o Android Studio ele também tem uma ferramenta de análise de log que vai permitir com que a gente veja todo o log durante a execução do nosso aplicativo, para acessar esse log, certo, a gente vem aqui nessa parte de baixo do Android Studio e aqui nessas abinhas que tem aqui terminal, a gente tem aqui o build e temos esse aqui logcat, entre essas outras possibilidades, dentre elas a gente tem esse logcat que é justamente esse carinha que vai ficar responsável em analisar todo o logo do nosso dispositivo, está bom? Então se a gente vê aqui algumas das opções a gente percebe que logo aqui no começo ele está selecionando qual que é o dispositivo que ele está ali investigando o log, se de repente você tivesse mais de um dispositivo de pé, seja outro emulador ou seja um dispositivo físico, ele também abriria essa possibilidade e mostraria de qual o dispositivo que ele está fazendo log. Então é muito importante você primeiro olhar qual que é o dispositivo para ver se é realmente o que você espera, porque se de repente você quiser encontrar um log e o dispositivo que você está executando, mas aqui está marcando um outro dispositivo que está em tempo ocioso você não vai conseguir investigar isso, está bom. Então fique bem atento nessa primeira opção. Bacana. Logo em seguida ele fala exatamente qual que é o pacote do aplicativo que ele está analisando, percebe que ele tentou analisar ali do nosso aplicativo e ele está falando com essa mensagem de dead, que ele está morto porque realmente esse foi fechado. E aí ele não está fazendo só essa análise, ele está pegando também de outros pacotes aqui também que aí vai de outros aplicativos, serviços disponíveis aqui no nosso celular. Aí beleza, bacana, a gente tem todos esses logs e realmente fica muito difícil de analisar, certo, dado que esses logs aqui podem ser de qualquer outra coisa que não tem relação com o nosso aplicativo, aí para isso, para a gente facilitar essa busca a primeira coisa que eu vou sugerir para vocês é o seguinte: é logo aqui nessa última opção a direita que está indicando “no filters” é você clicar nela e mostrar... e, aliás, selecionar a opção show only selected application, o que é que isso significa? Que ele vai mostrar apenas o log da nossa aplicação, está bom? Que aí dessa maneira a gente vai ter uma capacidade muito mais poderosa de analisar aqui o nosso log porque vai mostrar apenas o que aconteceu do nosso aplicativo em relação ao que a gente implementou, está bom? Então eu vou clicar nessa primeira opção e olha só ele já filtra bastante aqui esses logs e agora só mostra logs que estão relacionados ao nosso pacote, está vendo? BR com Alura agenda. Então é dessa maneira que a gente facilita a busca aqui de log que se acaso acontecer algum problema, isso a gente vê, como eu havia comentado, a gente tem aqui uma exception, a gente tem uma RuntimeException nesse caso e ele está falando que foi exatamente ali no resumo da nossa activity, no momento em que tentou ali configurar a nossa lista. Se a gente vir um pouquinho mais à direita a gente sabe que a gente tem a descrição aqui da nossa exception e aqui ele está falando o seguinte, ele está falando exatamente aqui a mensagem que essa RuntimeException passou, que ele está falando: olha, não chame o setOnClickListener para um AdapterView. Então a gente fez isso e foi exatamente isso que desencadeou ali aquela expection. E além disso ele está falando: olha, muito provavelmente aí você está querendo fazer a configuração do setOnItemClickListener ao invés de você usar ali o seu OnItemClickListener. O que é que isso significa, pessoal? Significa que cada vez que a gente quiser aplicar um tipo de listener para um AdapterView a gente não vai conseguir usar o setOnClickListener, a implementação de setOnClickListener é por padrão lançar essa exception e aí sugerir a implementação desse setOnClickListener. Porque é que isso acontece? Porque quando a gente faz ali o set de click listener para um ListView muito provavelmente a gente não quer que o componente inteiro ListView ele tenha o listenter, a gente quer que seus elementos, seus itens tenham o listener que é o que a gente quer realmente para os nossos alunos, clicar em cada um deles. Então por isso que já foi implementado essa ideia de que se a gente vai colocar um listener por ListView faz ali o crash da aplicação e já indica: olha, você não usar isso e use, sim, esse outro carinha aqui que vai perceber o listener para cada um dos elementos. Então ao invés de a gente usar ali o nosso OnClick aqui que é o nosso OnClickListener a gente vai usar esse outro método aqui, está bom. Então vamos lá, para isso eu vou copiar aqui já para facilitar a nossa vida, eu vou remover esse código aqui, deixa eu só estender aqui, ctrl shift F12, e agora eu vou implementar esse outro método aqui, está bom. Aí veja que ele já tem esse outro método, repare também que esse método é exclusivo aqui de AdapterViews está bom, então se de repente você tentar fazer isso em uma outra view talvez não exista ele, então é um fato bem importante. E agora aqui dentro a gente vai implementar uma outra interface para a gente ver aqui, a gente pode tentar autocompletar e ele mostra que agora ele vai implementar uma interface do AdapterView e não da view, que é o AdapterView.OnItemClickListener. Vamos dar um enter aqui e vamos ver o que acontece. Aí percebe agora é um outro método totalmente diferente do OnClick, certo? Porque o OnClick ele aparecia apenas a view, a gente pode ver aqui diretamente quando a gente tem a implementação do setOnClickListener do floating action button e agora a gente tem esses quatro argumentos, certo? A gente tem bastante argumento aí que a gente pode estar tentando trabalhar, bacana. E vamos agora tentar entender esses argumentos. Como a gente pode ver esse primeiro argumento ele refere-se justamente ao AdapterView que nesse caso é nossa ListView, esse outro elemento ele representa a view que foi clicada, então, por exemplo, se eu clicar aqui no Alex, que é aquele que está aparecendo, ele não vai fazer isso agora porque ele quebrou, mas se eu clicasse nele ele representaria por meio dessa view. E aqui esses dois que está como I e L ainda não tem muito significado para a gente. E agora eu vou tentar traduzir aqui para vocês e a gente já vai colocar um nome que faça sentido. Nesse terceiro argumento a gente tem a posição do elemento, tudo bem? Então, por exemplo, quando a gente teve aí o Alex muito provavelmente ele tem a posição zero, dado que o índice aqui em programação costuma ser zero, e aqui no final a gente tem uma informação que representa o ID, está bom? Em AdapterViews quando a gente acaba utilizando ali os adapters muito internamente tem a capacidade de trabalhar também com IDs. Nesse momento a gente não vai falar muito a respeito, mas entenda que tem essa possibilidade e é por isso que ele vem também aqui na ação de clique do item, está bom? Bacana, então a gente tem essas informações, mas agora, dado que a gente tem essas informações, o que é que a gente pode estar utilizando delas para poder ali começar com o que a gente espera que é pegar um aluno e poder editar. Se a gente perceber bem a gente sabe que a posição é um grande candidato para que a gente consiga recuperar esse aluno, dado que a gente tem uma lista de alunos aqui disponível, certo? Então vamos fazer o seguinte, dado que a gente quer explorar essa parte da posição, ver se realmente funciona como o esperado, vamos agora imprimir essa mensagem aqui com a posição do aluno e vamos ver se realmente ele vai ali obedecer conforme o que é esperado. Então, por exemplo, é um aluno que está na primeira posição vai aparecer a posição zero, é um aluno que está segunda posição vai aparecer a posição um, vamos ver como é que isso funciona. Aí a gente para poder colocar isso a gente colocaria ali um Toast, certo? Só que agora eu vou mostrar uma abordagem um pouquinho diferente agora que a gente aprendeu sobre aqui o nosso logcat, tudo bem? Eu vou ensinar para vocês como que a gente pode estar colocando aqui logs diretamente aqui no logcat para a gente conseguir fazer esses testes, está bom, que aí dessa maneira se caso você precisar debugar o seu aplicativo ou então você quer colocar uma mensagem de feedback, mas que não fique visual assim como é o Toast você pode estar usando essa ferramenta, está bom? E aí para a gente colocar esse log, pessoa, a gente tem um templetezinho também, então deixa eu estender aqui o código, que é esse templete aqui: log, está vendo? Log. Então quando a gente coloca esse log aqui, log e i no final ele já fala que ele já vai colocar esse templete que é da classe log.i, então se a gente colocar aqui, olha só, log i e aí ele já tenta autocompletar aqui para a gente. Essa tag aqui ele vai indicar o seguinte, vai ser uma chave na qual a gente vai conseguir identificar esse nosso log ali dentro do logcat, porque como a gente viu é um log muito grande e as vezes fica difícil de a gente identificar, tem que ficar fazendo ação e assim por diante, aí se a gente coloca aqui essa tag a gente tem a capacidade até mesmo de filtrar por meio desse filtro aqui que temos aqui em cima, está bom? Então é por isso que temos essa tag aqui. Então nessa tag a gente pode implementar aqui uma constante que tenha essa tag ou então a gente pode colocar até mesmo uma string, por exemplo, a posição do aluno, a gente pode colocar posição aluno por exemplo, aí aqui do lado a gente pode colocar realmente o valor que a gente espera para esse log, então para esse log a gente quer pegar exatamente a posição concatenada, então eu vou concatenar a posição aqui. Então é dessa maneira que a gente acaba colocando aqui uma mensagem de via log que vai ser acessível aqui no nosso logcat. Então agora que a gente colocou o listener no item e também a gente colocou um log vamos executar o nosso aplicativo e vamos ver o que acontece, está bom? Então shift F10 para executar o nosso aplicativo, eu vou deixar o logcat aberto para a gente ver o que é que vai acontecendo aqui durante essa execução, está bom. Então eu vou até deixar ele aberto aqui bem grandão e percebe que ele vai mostrando aqui vários logs, aparentemente ele não quebrou, então não quebrou mesmo o nosso aplicativo e aqui ele apareceu tudo bonitinho para a gente. Então agora o que é que eu vou fazer, eu vou cadastrar um aluno da maneira como a gente estava acostumado, então eu vou colocar o Alex aqui, eu vou salvar e beleza, a gente tem nosso Alex. Agora a gente quer testar aquele novo comportamento, certo, que é o nosso novo listener, então eu vou clicar aqui e vamos ver o que acontece. Olha só que bacana, ele está aparecendo aqui, eu vou clicar várias vezes e olha só: ele aparece aqui o Alex, está bom. Então percebe que agora a gente tem uma outra maneira de pegar um feedback aqui por meio do Android Studio quando a gente está desenvolvendo, porque o Toast por mais que ele funcione, ele já fica ali no emulador, a gente não precisa nem usar o Android Studio, ele tem também um probleminha que é justamente a gente ter que ficar ali vendo a parte visual, de repente a gente clica, ele passa o tempo, a gente não consegue ver da maneira esperada. Com o log a gente tem a capacidade de fazer os cliques, saber quantos cliques aconteceram, isso é uma informação importante também e essa informação ela não se perde. Então a gente vai conseguir testar, a gente vai conseguir fazer o mapeamento, a gente vai ter maior poder em relação a essa parte de log, em relação ao feedback da nossa implementação, está bom? Bacana. Vamos só cadastrar agora mais um aluno para ver se realmente ele funciona como o esperado, então eu vou colocar aqui a Fran por exemplo e vamos só ver se nessa parte, a posição, então aqui no Alex é posição zero e na Fran a posição um, a gente consegue ter o que a gente espera, sim, a gente consegue. Então agora sim a gente conseguiu dar o primeiro passo e também a gente aprendeu a usar aqui o nosso logcat. Aí só para poder fechar essa parte do logcat e aí logo em seguida a gente avançar nessa parte da edição do nosso aluno, um outro fator bem importante é que a gente tem aqui os tipos de logs, então ali quando a gente fez esse log.i o que a gente implementou foi esse de info, então se a gente só colocar esse de info não vai aparecer nenhum outro tipo de log a não ser o de info, também da mesma maneira se fosse esse também a gente teria só informações. A gente percebe também que para poder identificar tem esse w/, também no caso do i a gente vai ter o i/, então é dessa maneira que a gente acaba trabalhando aqui com os logs, de repente você quer colocar um log que realmente ele vai acontecer por causa de um erro, aí você vai lá, coloca o log e filtra aqui por erro, então, por exemplo, se eu colocasse aqui um e ele mostraria ali e seria um erro. Eu vou só executar por questões de teste mesmo, inclusive para poder testar posteriormente o que é que eu vou fazer para a gente não ter que ficar cadastrando na mão. Logo no começo do onCreate mesmo eu vou pegar aqui a nossa referência e vou salvar dois alunos, que aí dessa maneira a gente consegue ficar testando sem ter que ficar colocando no formulário. Então eu vou deixar Alex, aqui as informações de telefone eu vou deixar aqueles padrões que eu estou acostumado a deixar, e aí dessa maneira facilita o nosso teste ao invés de a gente ficar ali colocando manualmente via formulário. Então eu fiz o primeiro aluno, agora eu vou fazer o segundo aluno, que vai ser aluna, vai ser a Fran. Então eu vou deixar o mesmo telefone e a coisa que eu vou mudar é o e-mail, o e-mail eu vou deixar fran@gmail.com, está bom? Então esses são dos dois alunos que eu vou usar como exemplo porquê dessa maneira a gente vai facilitar aqui o nosso teste. Então agora eu coloquei um log de erro para a gente ver o que acontece, para ver se realmente ele filtra aqui para a gente, e assim que ele executar aqui o nosso aplicativo a gente vai fazer esse teste. Vamos ver se ele coloca os alunos para a gente, já colocou os alunos, dado que a gente está usando, agora eu cliquei e ele já mostra aqui o Diego. Agora eu vou deixá-lo que ele vai mostrar todas as possibilidades e agora sim a gente vê que a gente tem os nossos logs aqui, cada vez que a gente clica aqui no nosso aluno ele já faz ali o log bonitinho para a gente. Aí só para poder estar reforçando: se você não vai ser um erro, deixa o i mesmo que é o log de info que é o que é esperado, está bom? Sempre entenda, que cada vez que você usar esses logs você tem que usar consciente, então no geral vai ser o de info, mas aí se tiver alguma outra ação em relação a essas outras possibilidades, aí você pode estar usando sem nenhum problema. Bacana, a gente aprendeu sobre log, a gente aprendeu sobre o listener para cada um dos elementos do AdapterView, a seguir a gente vai trabalhar em cima desse carinha aqui, desse nosso novo listener para possibilitar a edição. Então até já.

@@06
Ação de clique em cada aluno

Ao implementar o listener de clique na ListView o App quebrou. Por qual motivo tivemos esse problema?

A implementação do listener de clique para AdapterViews lançam uma Exception.
 
Isso mesmo! Inclusive, existe uma orientação para que utilize o setOnItemClickListener() no lugar.
Alternativa correta
Porque o listener foi implementado antes de buscar a ListView.
 
Alternativa correta
O App quebra quando implementamos a interface View.OnClickListener ao invés da AdapterView.OnClickListener.
 
AdapterView não tem implementação própria para listener de clique.
Alternativa correta
Porque o listener foi implementado antes de setar o Adapter.

@@07
Transferindo dados entre Activities

Conseguimos implementar um listener para cada um dos alunos, pegamos a sua posição, mas até agora a gente não conseguiu pegar a referência do aluno aqui dentro do nosso código, sendo assim, antes de a gente começar a implementar a solução que vai editar esse aluno, primeiro a gente tem que ter ele, certo? Então vamos pegar esse aluno, para isso o que é que a gente precisa fazer? A gente tem que ter acesso a lista que está todos os alunos, que é justamente a lista que é devolvida aqui nesse dao .todos. Então o que é que eu vou fazer, pessoal? Eu vou fazer o seguinte, eu vou extrair esse dao. Todos para uma variável, que aí ela vai ser acessível, tanto dentro do argumento aqui da init adapter como também no nosso lister, está bom? Então vamos lá. Para isso eu vou usar o .var que ele vai criar uma variável local e vou chamar ela de alunos, está bom? Bacana. Agora que a gente acesso aos alunos o que é que eu vou fazer vai ser o seguinte: logo antes de chamar aqui o log eu vou chamar os alunos get e vou passar a posição. E aí dessa maneira a gente identifica que esse aluno aqui é justamente o aluno escolhido, certo? Então vai ser a partir desse aluno escolhido que a gente vai trabalhar aqui com a ação de editar, e aí como a gente já sabe dado que a gente está usando uma variável local dentro de uma implementação de classe anônima ela tem que ser final, certo? E a gente pode usar a técnica do Android Studio ou simplesmente escrever final que aí já possibilita, está bom? E aí ao invés de usar ali a posição a gente pode até colocar diretamente o aluno escolhido, tudo bem. Se a gente deixar dessa maneira ele vai usar o to string que, por padrão, faz o print do nome. Ao invés de deixar a tag como posição do aluno a gente coloca apenas aluno, está bom? Bacana. Vamos só testar, antes de a gente continuar com os próximos passos para a gente ter certeza se funciona como o esperado. Então vou dar um shift F10 aqui, como a gente sabe a gente está trabalhando com o log, então para a gente testar a gente vai abrir aqui o logcat, está bom, e vamos abrir aqui o nosso emulador. Um detalhe que é bem bacana, pessoal, é o seguinte: percebe que esses logs que acontece logo no começo a gente não quer muito utilizá-los dado que não tem tanta importância para a gente, portanto o que a gente pode fazer é apagá-los. Então a gente vem aqui nesse botãozinho que é chamado de clear logcat e ele já limpa ali todos os logs que aconteceram durante a execução, e agora só vão aparecer os novos logs que seria referente, por exemplo, aos cliques, está bom? Isso facilita justamente para poder identificar ali o log que a gente quer identificar, está bom? Então vamos lá, voltando aqui o nosso aplicativo se eu clicar aqui no Alex ele está falando que pegou o Aluno Alex, tudo bem, agora se eu clicar aqui na Fran ele também indica que pegou o aluno Fran, está bom. Então realmente a gente tem a capacidade agora de pegar esses alunos dado o clique que a gente faz neles, e agora sim a gente precisa encontrar algum tipo de solução que vai permitir essa edição, está bom. Se a gente pensar nas possibilidades do nosso aplicativo uma das ideias bacanas que a gente poderia considerar seria a seguinte: quando a gente clica, por exemplo, em um aluno a gente poderia abrir o nosso formulário que a gente já tem pronto, está bom, e nesse formulário que a gente já tem pronto a gente já poderia preencher esses campos com as informações do aluno, então quando a gente tivesse as informações do aluno e fizesse as alterações a gente clicaria novamente em salvar e ao invés de salvar esse aluno novamente ele iria lá e faria a edição, está bom? Então é justamente esse comportamento que a gente vai implementar para poder editar o aluno. Então agora que a gente tem o aluno a gente vai abrir essa nossa activity enviando esse aluno, que aí dessa maneira a activity vai ter acesso a ele vai conseguir fazer as edições da maneira esperada, está bom. Então vamos fazer esse tipo de implementação, vamos lá. Para isso o que é que a gente tem que fazer, pessoal? A gente tem que abrir ali a nossa activity, a gente já aprendeu que para abrir uma activity a gente tem que usar ali o nosso intent, certo? Então deixa eu apagar aqui o nosso log e agora vamos colocar ali a nossa instância da intent, então new intent e vamos colocar que aqui a gente está na referência da nossa lista alunos activity como contexto, certo, então o this dela e a gente vai entrar justamente no nosso formulário, então é formulário aluno activity.class, está bom? Bacana. A gente tem aqui agora o nosso intent que ele vai representar a nossa intenção que é vai para formulário activity, certo? E agora a gente tem que fazer a inicialização, bacana, então a gente vai lá e coloca o start activity. Beleza. Se a gente só colocar desse jeito, pessoal, a gente vai ter exatamente o mesmo comportamento que o nosso floating action button faz, certo? O que é que ele faz? Ele vai lá, abre o formulário e ele faz exatamente o que a gente está fazendo aqui agora, tudo bem, a gente está fazendo apenas a inicialização. E o que é que a gente precisa fazer de diferente? A gente precisa mandar essa informação e até o momento a gente não executou isso, e para a gente conseguir mandar essa informação a gente vai ter que explorar um pouquinho mais sobre o que a intent tem aqui para nos oferecer. Dentre as opções existentes uma que é bem comum para transferir dados entre as activitys é um recurso conhecido como extra, nesse extra a gente vai ter a capacidade de transferir qualquer tipo de dado, então a gente vai ter a capacidade de transferir dados primitivos como também objetos. Então se a gente utilizar aqui o nosso vai para formulário activity a gente percebe que eles têm alguns métodos que se tratam desse extra a partir de um put, esse put ele refere-se justamente aquela estrutura de dados conhecido como map que vai ter uma chave e um valor. Então aqui, olha só, a gente tem um put extra que ele recebe uma string, que ele recebe um inteiro, recebe um char, está vendo, então a string ela representa aqui a chave justamente da mesma maneira que a gente usou ali no nosso log e logo na parte direita, que é o segundo argumento, seria o valor, então veja que ele tem diversos tipos de valores que ele recebe, está bom? Então agora vamos implementar aqui um que vai receber uma chave que vai receber uma chave que vai representar o nosso aluno e como segundo argumento ele vai mandar ali o nosso aluno, está bom. Então vamos lá, put extra, agora a gente tem diversas sobrecargas aqui para poder estar preenchendo, então aqui a gente vai colocar uma chave para poder identificar o aluno a gente pode escrever aqui uma string chamada aluno, não tem nenhum problema. E agora a gente tem que mandar o nosso aluno escolhido, então a gente coloca aqui aluno escolhido, está bom, aí dessa maneira a gente vai estar mandando vai extra para outra activity. Aí perceba o seguinte: quando a gente utilizou essa abordagem ele acabou dando erro de compilação, porque é que isso acontece? A gente tentar ver um pouquinho do erro ele não dá muitas informações porque é que esse erro acontece, e realmente é bem comum isso acontecer, não se assuste, então agora eu vou passar para vocês o motivo de isso acontecer. É que é o seguinte, pessoal, para a gente conseguir mandar dados via extra esse tipo de dado ele tem que ser serializado, ou seja, ele tem que ser capaz de ser transformado em bytes e de bytes para objetos, e da maneira como a gente implementou a nossa classe aluno ela não tem essa capacidade, e como é que então a gente consegue fazer com que ela seja seriável, que ela consiga aí se transformar em bytes e de bytes voltar para o objeto aluno? Para isso a gente pode usar uma técnica bem simples, então se a gente vim aqui no nosso aluno, certo, ctrl N aluno a gente tem uma interface do próprio Java que já permite isso, então a gente coloca implements serializable. Então esse serializable ou da maneira que você preferir chamar, ele tem essa capacidade aí de converter os nossos objetos para bytes e daí de bytes para objetos, e aí quando a gente faz essa implementação do serializable a gente volta aqui para o nosso put extra e ele volta a compilar, e é dessa maneira que a gente consegue transferir objetos nossos para outras activitys. Se fosse, por exemplo, inteiros, strings ou valores primitivos não teríamos esse problema, mas para objetos exclusivos nossos a gente tem que estar transformando eles em um tipo de objeto que é capaz de serializar, está bom? Bacana, pessoal. Então agora que a gente está mandando esse dado, lá no nosso formulário a gente precisa recebê-lo, certo, porque se a gente executar o nosso aplicativo olha só o que vai acontecer, ele vai ter exatamente o mesmo comportamento do floating action button, certo, eu posso mostrar para vocês, para vocês verem acontecendo, não vai ter nenhuma diferença a não ser que dê algum tipo de crash, eu imagino que não, mas é realmente o mesmo comportamento, não muda nada. Então o que a gente precisa fazer agora é preencher essas informações, certo? Então agora a gente vai entrar no nosso formulário, então ctrl B na referência dele, e logo no começo quando ele cria aqui tudo bonitinho para a gente, a gente vai agora preencher esses campos, está bom, então vamos lá. Para isso eu vou fazer logo depois que ele faz toda a configuração necessária, que ele faz as inicializações e assim por diante e aí para que então a gente não tenha nenhum tipo de problema, porque de repente ele não encontrou ali as views ou alguma coisa do gênero, está bom. Então agora vem a questão: como a gente pode pegar esse aluno, certo? Como que a gente pode pegar aquela informação que a gente está mandando? Da mesma maneira a gente tem a capacidade pegar a capacidade de pegar a intent também dessa nossa activity, então se a gente chamar o método get intent a gente vai ter a capacidade pegar a intent que veio para ele, então aqui a gente pode extrair uma variável para chamar de dados, por exemplo, que é o que a gente está querendo lidar aqui. E agora, a partir desses dados, além de fazer o put extra que a gente conseguiu ver ali a gente tem também o get extra, então se a gente fazer aqui dados.get extra a gente vai ter a capacidade de pegar essas informações, está bom. Aí percebe que quando eu fiz esse get extra, diferente de um put extra, ele tem vários tipos de implementações diferentes, então extra seria ali um init que seria tudo completo, todos os extras possíveis, e aqui tem extras especializados, que é justamente a partir desses que a gente vai conseguir pegar a informação diretamente que a gente precisa, está bom. Então veja que a gente tem um boolean, a gente tem um init, um byte, e assim por diante. E dado que a gente mandou esse serializable extra a gente vai usar exatamente ele, porque foi exatamente esse tipo de dado que a gente mandou, está bom? Se fosse algum outro tipo de dado você usaria esse outro tipo de dado. Então vamos lá, get serializable extra, aí agora o que é que ele espera é o seguinte, é exatamente aquela chave que a gente mandou, está bom, que ele refere-se como name. Então aqui a gente vai deixar como aluno e o que a gente espera aqui é que ele devolva um aluno, é claro que se a gente usar ali o var para poder extrair uma variável aqui a partir desse retorno ele vai devolver como serializable porque é essa interface que ele utiliza, mas a gente tem a certeza de que esse aluno aqui é o aluno que a gente está mandando. Então, por exemplo, a gente pode deixar como informação de aluno como nome da variável e podemos mudar manualmente de serializable para aluno, está bom, a gente pode estar fazendo isso. Mas é claro, quando a gente faz essa conversão percebe que ele dá esse erro de compilação, isso acontece justamente porque a interface que foi utilizada aqui ela não está utilizando o generics, certo, ela exige que seja exatamente um serializable, está bom? Então por isso que está dando esse problema. Para poder resolver isso a gente tem que usar o nosso famoso cash, não é a maneira mais segura que a gente conhece, certo, mas é dessa maneira que a gente acaba abordando usando aqui essa interface do get serializable extra. Legal, a gente tem o aluno, agora que a gente tem acesso a esse aluno a gente pode preencher os nossos campos, certo? Então podemos, por exemplo, pegar a referência do campo nome, dado que ele já faz a inicialização dos campos aqui, então a gente não precisa se preocupar, e podemos setar o texto, então set text pegando aqui o aluno get name, get name não, get nome, acabei falando inglês, mas é get nome. Mas a gente ainda não tem esses getters, certo, dado que a gente não estava utilizando eles. Então antes de tudo o que é que eu vou fazer? Eu vou entrar aqui na nossa classe aluno e vou gerar os getters dessas informações, que aí dessa maneira a gente vai conseguir preencher todos os campos, para isso eu vou usar o template aqui que é o out insert getter, está vendo, aí aqui eu vou selecionar todos eles, está bom? Eu coloquei o shift e setinha para baixo e selecionou todos, eu vou dar um ok e ele gera aqui todos os getters para a gente, aí agora assim a gente pode pegar essas referências. Então get nome, aí agora a gente vai ter o campo telefone.setText, aluno get telefone e logo em seguida a gente vai ter o campo e-mail set text, vamos lá, opa, setText aluno get e-mail, está bom. Então agora sim a gente está colocando as informações desse aluno, vamos testar e ver o que acontece. Shift F10 para poder testar aqui, está bom, então a gente está testando aqui bonitinho, vamos ver o que acontece ao executar, aparentemente foi uma execução rápida, então não precisa nem fazer corte aqui, está bom, e vamos ver se ele preenche as informações do aluno, então eu vou clicar aqui no Alex e vamos ver o que acontece. Olha só, ele colocou aqui as informações, está bom, se eu voltar lá novamente na nossa lista e entra na Fran vamos ver o que acontece ele colocou aqui as informações da Fran. Aí é claro, pessoal, se a gente tentar fazer a edição ela não vai acontecer, eu posso até mostrar para vocês aqui, então, por exemplo, a Fran aqui eu vou colocar como Fran Silva, então quando eu coloquei como Fran Silva, por exemplo, imaginando que esse seja o sobrenome dela, eu vou clicar em salvar e olha só o que acontece, ele vai salvar um novo usuário, um novo aluno. Então da maneira como está a gente ainda precisa fazer alguns ajustes, mas a gente já conseguiu fazer ali as primeiras partes que foi justamente fazer essa transferência aqui das informações, a gente já conseguiu fazer isso daqui e agora que a gente tem acesso a esse aluno, a essa nova técnica que é transferir dados para a nossas activitys com a intenção de digitar as informações a seguir a gente vai refinar esse código para que ele permita essa edição, está bom. Então até já.

@@08
Implementando listener na ListView

Implemente o listener para cada item do ListView, utilizando para isso o método setOnItemClickListener() que recebe a interface AdapterView.OnItemClickListener como argumento. Faça essa implementação por meio de uma classe anônima.
Dentro do método onItemClick(), faça a impressão do parâmetro referente à posição do aluno na lista para testar o listener.

Para isso, adicione um log informativo com o método Log.i(). Lembre-se que ele precisa de uma chave e o valor.

Não foi detalhado em vídeo, mas tanto a chave como o valor do log precisam ser Strings, portanto, valores primitivos precisam ser concatenados ou convertidos.
Por fim, teste o listener, veja se ao clicar no aluno aparece a posição dele. Lembre-se de salvar alguns alunos no DAO dentro do onCreate() para facilitar o teste.

Ao clicar nos alunos deve aparecer logs com um formato similar a esse:
br.com.alura.agenda I/posicao aluno: 0
br.com.alura.agenda I/posicao aluno: 1COPIAR CÓDIGO
Em código temos o seguinte resultado:

ListaAlunosActivity.java:
public class ListaAlunosActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Lista de alunos";
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        setTitle(TITULO_APPBAR);
        configuraFabNovoAluno();
        dao.salva(new Aluno("Alex", "1122223333", "alex@alura.com.br"));
        dao.salva(new Aluno("Fran", "1122223333", "fran@gmail.com"));
    }

    // restante do código

    private void configuraLista() {
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.todos()));
        listaDeAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long id) {
                Log.i("posicao aluno", "" + posicao);
            }
        });
    }
}COPIAR CÓDIGO
Agora que aprendemos a adicionar listeners para cada aluno, a seguir vamos começar com a implementação para editá-los.

@@09
Carregando aluno no formulário

Faça com que o aluno clicado, seja enviado para o formulário, e também, apresente as informações dele nos campos respectivos (nome, telefone, email).
Primeiro busque o aluno na lista devolvida pelo DAO dentro do onItemClick(). Para isso, utilize o parâmetro de posição.

Para enviar o aluno, utilize o extra da Intent por meio do método putExtra(). Lembre-se que é necessário enviar a chave como uma String e o aluno como valor.

A técnica de transferência via extra, exige que o dado seja serializável. Sendo assim, faça com o que a classe Aluno implemente a interface Serializable.

Na Activity de formulário, dentro do o onCreate() pegue a Intent com o método getIntent(), em seguida, recupere o aluno que foi enviado por meio do método getSerializableExtra() enviando a mesma chave utilizada no putExtra(). Lembre-se que é retornada a interface Serializable, ou seja, vai ser necessário fazer o casting para Aluno.

Assim que tiver acesso ao objeto do aluno, preencha os campos para o nome, telefone e e-mail com as informações do aluno.

Por fim, faça o teste e veja se as informações dos alunos aparecem quando um aluno é clicado.

Ao finalizar essa implementação o App deve apresentar o seguinte comportamento:


Em código tivemos o seguinte resultado:

ListaAlunosActivity.java:
public class ListaAlunosActivity extends AppCompatActivity {

    // restante do código

    private void configuraLista() {
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        final List<Aluno> alunos = dao.todos();
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));
        listaDeAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long id) {
                Aluno alunoEscolhido = alunos.get(posicao);
                Intent vaiParaFormularioActivity = new Intent(ListaAlunosActivity.this, FormularioAlunoActivity.class);
                vaiParaFormularioActivity.putExtra("aluno", alunoEscolhido);
                startActivity(vaiParaFormularioActivity);
            }
        });
    }
}COPIAR CÓDIGO
Aluno.java:
public class Aluno implements Serializable { //restante do código }COPIAR CÓDIGO
FormularioAlunoActivity.java:

public class FormularioAlunoActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo aluno";
    private EditText campoNome;
    private EditText campoTelefone;
    private EditText campoEmail;
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle(TITULO_APPBAR);
        inicializacaoDosCampos();
        configuraBotaoSalvar();

        Intent dados = getIntent();
        Aluno aluno = (Aluno) dados.getSerializableExtra("aluno");
        campoNome.setText(aluno.getNome());
        campoTelefone.setText(aluno.getTelefone());
        campoEmail.setText(aluno.getEmail());
    }

    // restante do código

}COPIAR CÓDIGO
Um detalhe importante a ser notado é que se tentar inserir um novo aluno após essa implementação, o App não funciona. Não se preocupe, mais pra frente vamos resolver esse detalhe.

@@10
Para saber mais - Transferindo objetos com Parcelable

Aprendemos que para transferir nossos objetos via putExtra, precisamos configurá-los para que sejam serializáveis. Como solução, utilizamos a interface Serializable, porém, no Android, em algumas situações essa solução tende a ser mais custosa, ou seja, existe uma outra abordagem mais otimizada utilizando o Parcelable.
Considerando apenas a documentação, veja que a implementação possui algumas peculiaridades. Caso tenha interesse e queira informações de uma maneira mais prática, dê uma olhada neste artigo.

https://developer.android.com/reference/android/os/Parcelable.html

https://medium.com/@lucas_marciano/por-que-usar-o-parcelable-ao-invés-do-serializable-5f7543a9c7f3

@@11
O que aprendemos?

Nesta aula, aprendemos:
Implementar listener para AdapterViews;
Utilizar o log do Android;
Transferir dados entre Activities.

#### 09/09/2023

@02-Editando aluno pelo formulário

@@01
Editando aluno

Conseguimos carregar os nossos alunos no formulário, agora a gente precisa implementar o comportamento para editá-los, mas como que a gente pode estar fazendo isso? Considerando os princípios de edição uma das primeiras preocupações que a gente precisa ter é em como que a gente garante que um aluno é ele mesmo, o que eu quero dizer com isso? Perceba que a gente tem uma lista de alunos e temos aqui o Alex e também a Fran, mas nada impede de a gente criar um novo Alex ou uma nova Fran, que tem informações similares ou até o mesmo o mesmo nome, ou seja, o nome já não é uma informação segura o suficiente para a gente falar que um aluno é ele mesmo, se a gente explorar um pouquinho mais as suas informações a gente tem tanto telefone como também e-mail que parecem sim informações ali mais pessoais, mais exclusivas para cada aluno. Claro, se elas não fossem informações editáveis, informações que os próprios alunos mandassem e a gente conseguisse pegar até poderíamos considerar, porém aqui no nosso aplicativo a gente edita essas informações e nada impede de um usuário preencher essas informações com informações iguais e então a gente poderia ter o caso no qual a gente teria um Alex com o mesmo telefone e com o mesmo e-mail e aí a gente correria o risco de editar alguém que a gente não espera. Portanto usar essas informações editáveis não é seguro o suficiente para poder colocar esse tipo de implementação, então a gente tem que recorrer a outras informações, a outros dados que a gente tem disponível que pode nos permitir garantir essa informação, essa unicidade do aluno. E o que é que a gente pode estar utilizando? Pensando aqui no que a gente tem a gente poderia considerar que é posição, dado que o que a gente está editando, por exemplo, seria o aluno na posição zero, independente do que for é o aluno da posição zero, isso não muda, a gente poderia estar considerando isso. Porém se a gente considerar essa parte de posição ela não costuma ser o padrão para esse tipo de identificação de uma entidade que seria o nosso aluno, então o que a gente vai utilizar aqui vai ser justamente um padrão que é muito comum que é separar exatamente um campo que ele vai servir como um código de identificação e a partir desse código de identificação, independente da posição, do nome, do e-mail, telefone, a gente vai ter certeza que vai ser esse aluno, está bom, porque ele sempre vai ter esse código de identificação e ninguém vai meter a mão nesse código, vai ser apenas o nosso aplicativo, está bom. Então vai ser a partir dele que a gente vai estar garantindo aqui que um aluno é ele mesmo, que vai ser a implementação de um ID, os nossos famosos IDs, está bom. Então vamos agora fazer com que o nosso aluno suporte esse ID para que a gente consiga usar isso como parâmetro no momento da edição. Então eu vou entrar na nossa classe aluno e dentro dela o que é que eu vou fazer? Eu vou agora colocar o novo campo que vai representar esse ID, está bom, esse campo eu vou colocar como um inteiro, tudo bem, porque a partir desse inteiro eu vou indicar que o valor zero é um valor que ele não tem ID, é claro, IDs podem ter campos diferentes, poderia até ser uma string usando um outro padrão, existem diversos padrões a serem discutidos sobre IDs, no curso eu vou usar esse inteiro justamente por ser um ser um padrão também bastante comum e bem simples de fazer implementação de uma maneira que a gente consiga gerar novos IDs de uma maneira uniforme, está bom? Então é por isso que eu vou manter ele dessa maneira. Legal, temos agora o nosso campo para um ID, que é exclusivo, e precisamos agora aplicar a técnica na qual a gente vai conseguir gerar novos IDs, afinal cada vez que entrar um novo usuário ele precisa ter um ID diferente, que é a ideia que a gente tem aqui de ID, certo? Para isso o que a gente precisa fazer? A gente precisa voltar aqui no nosso aluno e precisamos fazer alguma modificação que permita agora adicionar novos IDs cada vez que um aluno é adicionado, para isso a gente pode usar técnicas do próprio Java, que é bem simples, por exemplo, um atributo estático de inteiro que vai ser um contato de IDs, então a gente pode estar colocando um desses. Então seria um private static e a gente colocaria int e depois falaria que ele serviria como contador de IDs, contador de IDs, agora foi, e aí a gente poderia falar que a princípio ele começaria com um ID que equivale a um, porque esse ID seria um ID válido e aí para os posteriores ele incrementaria mais um colocando aquela técnica de incremento. Então agora como é que funcionaria aqui o nosso algoritmo, a nossa lógica? No momento que entrasse aqui no salvar a gente indicaria que o aluno que a gente está recebendo via parâmetro ele iria setar o ID, é claro a gente não tem set, o setter nesse momento, então vamos indicar que a gente vai querer fazer o setter a partir desse nosso argumento que vai ser o contador de IDs e vamos pedir para o Android Studio criar para a gente. Aqui das opções ele está sugerindo criar o método que teria o corpo vazio, criar uma propertie que seria justamente um getter e um setter ou então criar um write only que seria criar apenas um método de apenas escrita, que seria só o setter. Nesse caso vamos criar a propertie porque dessa maneira a gente já cria quem vai conseguir setar e quem vai conseguir devolver essa informação para a gente dado que a gente vai precisar dela. Então aqui ele pergunta se a gente quer comiter o argumento do setter, gente quer sim e também o nome ID é reverenciando aqui o nosso atributo ID e no getter ele já devolveu aqui o ID para a gente, então a gente tem acesso a esses nossos métodos de acessos do nosso atributo. Agora na parte de baixo o que a gente precisa fazer é atualizar o contador de IDs, afinal quando você adicionar um ID para um aluno o próximo aluno tem que ter um ID diferente, certo? Então aqui entraria o contador de alunos, aliás, de IDs, desculpa, e colocaria o mais ++ que é pós incremento aqui, cada vez que executar esse código no final da execução ele vai fazer aqui o incremento adicionando mais um e aí vai vir o ID dois, ID três e assim por diante, está bom? Então a gente conseguiu agora criar aqui esse gerador de IDs e estamos atribuindo os IDs para os nossos alunos, portanto a gente já pode começar a colocar o comportamento de editável, então logo aqui mesmo no próprio aluno a gente pode fazer um public void edita que vai receber também o aluno, que a gente vai assumir que esse aluno ela te, há um ID, e dado que a gente assume que ele tem um ID agora a gente vai ter a capacidade, por exemplo, de buscar esse aluno a partir da nossa lista fazendo a comparação de IDs. Então o que a gente vai fazer aqui no nosso código é algo muito bem simples, a gente vai fazer um for it que vai passar por cada aluno contido na lista, desculpa, e aqui dentro eu vou fazer o seguinte, a partir dessa referência do A, eu coloquei A porque justamente aqui no parâmetro a gente está recebendo o aluno, então não tem como repetir o aluno, está bom? Então a partir desse nosso valor A eu vou fazer uma comparação, que vai ser a seguinte comparação, eu vou verificar, por exemplo, se o ID do A é igual ao ID do aluno que a gente está recebendo via parâmetro, porque se a gente encontra essa informação, se isso daqui é verdade, a gente conseguiu encontrar o aluno que a gente quer editar, e aí dessa maneira a gente consegue colocar esse aluno para uma nova referência, um objeto e fazer a edição da maneira que for necessária. Então o que é que eu vou fazer aqui agora? Eu vou pegar agora e criar essa nova referência que, a princípio, ela vai ser um aluno encontrado, a gente vai assumir que seja isso e vai ter valor nulo, porque se ele manter esse valor nulo a gente vai assumir que ele ainda não foi encontrado e aí quando ele é encontrado aqui dentro desse nosso código, dessa nossa lógica a gente atribuiu agora esse novo valor para ele, está bom. E aí agora o que a gente precisa fazer? Agora que a gente tem a possibilidade de encontrar ou não, logo depois aqui do nosso for it a gente precisa fazer uma lógica na qual vai permitir que esse aluno ele seja editado, certo? Então seria, por exemplo, uma lógica que garante que ele não é nulo, então aluno encontrado é diferente de nulo para poder não tomar no null pointer exception dado que é uma possibilidade, existe essa possibilidade. E logo aqui nessa outra parte aqui dentro do nosso if que a gente garante que esse aluno ele realmente ele existe, ele foi encontrado, a gente faz a edição. Para fazer a edição, dado que a gente utiliza aqui uma lista de alunos, a gente precisa substituir esse aluno a partir da posição dele, então o primeiro passo é pegar a sua posição, então a gente vai ter aqui um alunos.indexOf para pegar a posição dele a partir do nosso aluno encontrado, a gente vai ter acesso aqui a posição do aluno, posição do aluno. Aí em seguida o que a gente faz é justamente fazer aqui a substituição que vai ser alunos.set, então a partir do set a gente a tem a capacidade de dar a posição que a gente encontrou e substituir o aluno. Então o aluno que a gente quer colocar nesse momento é justamente o aluno que veio de fora, que é o nosso parâmetro. Então esse é o nosso código aqui para fazer a edição, primeiro a gente encontra o aluno e depois a gente verifica se ele realmente existe e aí então a gente aplica a edição, está bom? Então esse é o nosso código. Para poder formatar aqui bonitinho eu vou colocar o atalho ctrl L e ele já faz a identação bonitinha para a gente. Agora que a gente tem esse comportamento a gente só precisa usar aqui no nosso formulário, certo? Então voltando aqui no nosso formulário a gente precisa usar essa edição, dado que nesse momento o que é que a gente faz? A gente só está salvando, vamos fazer o seguinte, vamos comentar esse código aqui, está bom, e agora a gente vai fazer uma implementação na qual a gente vai editar, a gente vai usar aquele comportamento de edição, está bom. Então como que a gente vai usar esse comportamento? Se a gente chegar aqui no nosso código e simplesmente colocar um ponto edita, a gente precisa mandar uma referência de um aluno, certo? Se a gente mandar da maneira como a gente estava fazendo no momento que a gente tenta salvar a gente não vai ainda manter a informação de ID porque aqui ele está criando um novo aluno com as informações dos campos, ele está criando com essas informações dos campos, então o que a gente precisa fazer agora é seguinte: no momento que a gente for salvar a gente precisa fazer com que esse cria aluno ele seja modificado também, tenha um novo comportamento ao invés de criar um novo aluno, ele apenas preenche aqui agora com essas informações atualizadas, tudo bem? Então ao invés de ter que ficar ali criando um novo aluno a gente vai usar essa referência que a gente tem aqui e a partir dessa referência ele faz essas modificações, ele vai atualizando as informações do aluno, para que então a gente manter as informações atualizadas e também tenha acesso ao ID. Então o primeiro passo vai ser transformar esse aluno em um atributo para que todos os métodos tenham acesso, aí em seguida no momento em que a gente pede para criar um aluno a gente, na verdade, vai atualizar essas informações, está bom. Então vamos lá, vamos atualizar aqui as informações, a gente vai ter e-mail, telefone e e-mail, aliás, nome, telefone e e-mail, desculpa, eu tinha falado e-mail ao mesmo tempo, e ao invés de criar aqui um novo aluno vamos remover essa linha e vamos só atualizar essas informações. Então a partir do aluno a gente vai criar aqui os seus setters, está bom? Então vamos agora criar os setters para esse aluno para não ter que fazer isso manualmente. Para isso a gente pode voltar aqui no nosso código fonte da classe aluno, usar o out insert e vim nessa opção de setter, aí ele já vai lá e cria o setter para a gente, está bom? Ele falou que não encontrou setter porque a gente tem atributos final. Então o que é que eu vou fazer aqui nesse momento? Nesse momento eu vou apagar aqui esses finallys e agora eu vou fazer com essas informações sejam editáveis, dado que antes não era, mas agora vai ser, está bom? Então vamos lá, agora que elas serão editáveis a gente vai pegar aqui os nossos out inserts de novo, que é aquele templete, vamos agora selecionar todos os campos e vamos colocar aqui esses setter, colocamos os setters, o que a gente precisa fazer agora é simplesmente usar aqui o set de novo para colocar o nome, o set, vamos lá, aluno set telefone para colocar o telefone e também o aluno set e-mail para colocar o e-mail, e agora assim a gente está atualizando aqui o nosso aluno, inclusive a gente pode até modificar o nome desse método, ao invés de ser um crie aluno eu vou usar o shift F6 para atualizar o nome, ao invés de ser o crie aluno vai ser preenche aluno, aí já fica muito mais fácil o que ele faz. Aí está perguntando se a gente quer fazer a refatoração, sim, a gente quer por mais que aqui esteja comentado, ele já vai fazer isso para a gente, e também a gente não vai devolver mais nada, porque agora ele está usando a referência via atributo, aí pode apagar até o no null que estava tentando garantir que não mandasse uma referência nula. Beleza, a gente conseguiu criar agora o nosso preenche aluno, a gente vai chamar ele aqui embaixo e agora a gente assume que no momento que ele está preenchendo a gente consegue acesso a esse aluno, está bom? E aqui no edita a gente manda o nosso aluno via atributo, o acesso que eu falo ao aluno é o aluno atualizado. Então agora sim a gente conseguiu colocar o comportamento de editável, podemos testar e ver o que acontece. Shift F10 para testar, eu vou abrir aqui o emulador para a gente ver como é que vai ficar aqui esse nosso novo comportamento, veja que foram bastantes espaços, mas realmente não é uma coisa tão complexa assim, a questão é que realmente ali existem várias teorias, vários motivos para fazer da maneira como a gente fez. Agora eu vou tentar editar, por exemplo, o Alex, então o Alex ele vai estar aqui bonitinho para a gente e eu vou colocar como Alex Felipe por exemplo, e o telefone de 12222 eu vou deixar no final 444 e o e-mail eu vou deixar apenas .com para ver se edita também todas as informações. Eu vou clicar em salvar e vamos ver o que é que acontece. Nessa de salvar ele não saiu porque a gente não colocou o comportamento, certo, então por isso que ele não saiu, mas voltar aqui e ver o que é que acontece no momento que ele carrega, ele carrega aqui com o Alex Felipe, então ele carregou com o Alex Felipe, com as informações atualizadas e o que a gente precisa fazer aqui é só dar um finish que eu acabei esquecendo aqui como a gente fazia aqui no de salvar. Então dando um finish só para poder testar novamente aquele comportamento de fechar o formulário e voltar para a nossa lista para a gente deixar tudo redondo antes de fazer qualquer outro passo a mais. Vamos só testar agora na Fran, então na Fran, por exemplo, eu vou deixar Fran Silva, eu só vou mudar apenas o nome que a gente viu que modifica ali os nossos outros campos, certo? Então salvando aqui ele fechou e já apareceu a Fran aqui para a gente. Se a gente editar de novo vamos ver o que acontece, olha só que bacana, Fran Tavares, por exemplo, e vamos salvar aqui para ver o que acontece, vamos lá, ele salvou tudo bonitinho. Então agora sim a gente conseguiu colocar esse novo comportamento para editar os nossos alunos, está bom. Então até já.

@@02
Adicionando id para o aluno

Caso você precise do projeto com todas as alterações realizadas na aula passada, você pode baixá-lo neste link.
Vamos dar início na implementação de edição de aluno. Nessa atividade o nosso objetivo é fazer o aluno suportar ids.

Sendo assim, modifique a classe Aluno para que tenha um id, utilize o tipo int para o id. Altere o DAO para que gere um id novo para cada aluno que for salvo.

O gerador de ids é feito a partir de um atributo estático.
Crie o método edita() que recebe um aluno. Nesta implementação, primeiro implemente o código que busca um aluno a partir do seu id. Essa busca pode ou não encontrar um aluno, portanto, antes de editar certifique-se que o aluno não é uma referência nula.

Para a edição, busque a posição do aluno que foi encontrado, então utilize o método set() da lista de alunos, enviando a posição do aluno encontrado e o aluno que foi enviado via parâmetro respectivamente.

Esta atividade não precisa de execução. Porém,

Para ter certeza que está funcionando, adicione um log dentro do listener para cada item imprimindo o id do aluno.

https://github.com/alura-cursos/fundamentos-android-parte-2/archive/aula-1.zip

O código da implementação fica da seguinte maneira:
Aluno.java:
public class Aluno implements Serializable {

    private int id = 0;

    // restante do código

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}COPIAR CÓDIGO
AlunoDAO.java:
public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();
    private static int contadorDeIds = 1;

    public void salva(Aluno aluno) {
        aluno.setId(contadorDeIds);
        alunos.add(aluno);
        contadorDeIds++;
    }

    public void edita(Aluno aluno) {
        Aluno alunoEncontrado = null;
        for (Aluno a :
                alunos) {
            if (a.getId() == aluno.getId()) {
                alunoEncontrado = a;
            }
        }
        if (alunoEncontrado != null) {
            int posicaoDoAluno = alunos.indexOf(alunoEncontrado);
            alunos.set(posicaoDoAluno, aluno);
        }
    }

    // restante do código

}COPIAR CÓDIGO
Caso tenha interesse no teste para verificar se o id está sendo gerado da maneira esperada, adicione o seguinte log:

listaDeAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long id) {
        Aluno alunoEscolhido = alunos.get(posicao);
        Log.i("idAluno", String.valueOf(alunoEscolhido.getId()));
        // restante do código
    }
});COPIAR CÓDIGO
Se testar com 2 alunos, deve aparecer a seguinte mensagem:

br.com.alura.agenda I/idAluno: 1
br.com.alura.agenda I/idAluno: 2

@@03
Editando aluno no formulário

Na Activity de formulário, faça com que o objeto do aluno, inicializado pelo extra, seja um atributo.
Em seguida, renomeie o método criaAluno() para preencheAluno(), e então, ao invés de criar um aluno, altere as informações do atributo que representa o aluno. Consequentemente esse método não vai mais devolver um Aluno, portanto, mude a assinatura para void.

Se não tiver implementado os setters do aluno, aproveite e implemente nesse momento.
Dentro do listener do botão salvar. Comente o código que salva, então, adicione o código que edita o aluno. Para a edição, primeiro chame o método preencheAluno() e depois o edita() do DAO, enviando o atributo aluno.

Por fim, chame o método finish() para que o formulário seja fechado e a lista atualizada. Teste o App e veja se a edição funciona.

O App deve apresentar o seguinte aspecto:


O código desta implementação ficou da seguinte maneira:

FormularioAlunoActivity.java:
public class FormularioAlunoActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo aluno";
    private EditText campoNome;
    private EditText campoTelefone;
    private EditText campoEmail;
    private final AlunoDAO dao = new AlunoDAO();
    private Aluno aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // restante do código

        Intent dados = getIntent();
        aluno = (Aluno) dados.getSerializableExtra("aluno");
        campoNome.setText(aluno.getNome());
        campoTelefone.setText(aluno.getTelefone());
        campoEmail.setText(aluno.getEmail());
    }

    private void configuraBotaoSalvar() {
        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Aluno alunoCriado = preencheAluno();
////                salva(alunoCriado);
                preencheAluno();
                dao.edita(aluno);
                finish();
            }
        });
    }

    // restante do código

    private void preencheAluno() {
        String nome = campoNome.getText().toString();
        String telefone = campoTelefone.getText().toString();
        String email = campoEmail.getText().toString();

        aluno.setNome(nome);
        aluno.setTelefone(telefone);
        aluno.setEmail(email);
    }
}COPIAR CÓDIGO
A seguir, vamos melhorar o código para que nosso app permita tanto editar como inserir alunos.

@@05
Flexibilizando formulário

Agora, precisamos que o formulário permita tanto editar como salvar alunos. Para isso, no onCreate() envolva o código que pega o aluno via extra e preenche os campos do formulário em um if que verifica a existência do extra por meio do método hasExtra() da Intent.
Caso contrário, faça com que o atributo do aluno seja inicializado por meio de uma instância vazia.

Atualmente existe apenas um construtor que recebe parâmetros, ou seja, crie um construtor sem argumento.
Modifique o código do listener do botão salvar para que antes de salvar ou editar, verifique se o id do aluno é válido.

Para verificar se um id do aluno é válido, implemente o método temIdValido() na classe Aluno, todos ids maiores que 0 são válidos.

Caso o id for válido, peça para o DAO editar, caso contrário peça para salvar. Por fim, chame o método finish() fora do escopo do if.

Lembre-se de remover o método salva() da Activity, pois não é mais utilizado.
Teste o App e veja se ele é capaz de salvar ou editar alunos.

O App deve apresentar o seguinte resultado:


O código ficou da seguinte maneira:

FormularioAlunoActivity.java:
public class FormularioAlunoActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo aluno";
    private EditText campoNome;
    private EditText campoTelefone;
    private EditText campoEmail;
    private final AlunoDAO dao = new AlunoDAO();
    private Aluno aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle(TITULO_APPBAR);
        inicializacaoDosCampos();
        configuraBotaoSalvar();

        Intent dados = getIntent();
        if (dados.hasExtra("aluno")){
            aluno = (Aluno) dados.getSerializableExtra("aluno");
            campoNome.setText(aluno.getNome());
            campoTelefone.setText(aluno.getTelefone());
            campoEmail.setText(aluno.getEmail());
        } else {
            aluno = new Aluno();
        }

    }

    private void configuraBotaoSalvar() {
        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preencheAluno();
                if(aluno.temIdValido()){
                    dao.edita(aluno);
                } else {
                    dao.salva(aluno);
                }
                finish();
            }
        });
    }

    //restante do código

}COPIAR CÓDIGO
Aluno.java:
public class Aluno implements Serializable {

    private int id = 0;
    private String nome;
    private String telefone;
    private String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Aluno() {

    }

    // restante do código

    public boolean temIdValido() {
        return id > 0;
    }
}COPIAR CÓDIGO
Veja que com esse ajuste o formulário fica flexível o suficiente para salvar ou editar alunos.

@@06
Refatorando código

Agora que finalizamos a feature de edição de alunos e as anteriores estão funcionando da maneira esperada, a gente pode dar uma olhada nos códigos que a gente modificou, verificar se existe possíveis refatorações, e se existir, a gente aplica. Para isso vou deixar as classes que mexemos durante o procedimento abertas, e vou passando em cada uma delas vendo o que pode ser melhorado. Vamos começar com a lista alunos activity, dentro dela a gente mexeu bastante no método que configura a lista. Antes era mais enxuto, dado que só buscava listview, pegava acesso a todos os alunos a partir do nosso dao, e configurava o adapter. Agora, ele adicionou um comportamento a mais, também configura o listener para cada item, para cada clique de item, tem um listener. Vamos lá, precisamos deixar mais enxuto e resumido de forma que olhamos de cara e sabemos o que acontece em cada parte desse código. A gente viu que para isso temos técnicas de refaturacao que é a própria extração, então a gente pode extrair métodos, como o adapter, um código grande para todos esses passos, podemos extrair para um configura adapter, caso você não decorou o atalho, é o ctrl-alt-M que faz isso para gente. Agora, no listener, a gente pode extrair outro método, seria configura, listener, de clique por item, a gente pode fazer dessa maneira que fica bem descritivo o que estava sendo feito, ok? Então agora sim nosso configura lista ficou enxuto o suficiente para ficar claro o que está acontecendo. Mas tem um detalhe que eu não fiquei sabendo de algumas das peculiaridades da implementação de listener, veja que nessa implementação de listener, estamos mandando nosso listview, ele que precisa do listener, faz todo o sentido, et b estamos mandando a referência da lista, e acreditando que essa referência da lista é a mesma do nosso adapter, tudo bem, dado que estamos fazendo nosso código, não vamos ter modificação, vamos mandar a mesma lista, mas pode correr o risco de mandar uma lista diferente para a configuração de adapter e para a configuração aqui do nosso listener, fazendo com que a gente não tenha exatamente as mesmas informações, porque a gente depende bastante da lista para poder buscar um aluno, tudo bem? O que quero dizer com isso? Que dado que a gente está fazendo uma implementação dentro de uma adapter view, faz todo o sentido a gente explorar um pouco mais para evitar essas complicações, que seria mandar referências diferentes, tanto para o adapter, que estamos fazendo o uso, como também para nosso listener, referente ao adapter. Então, ao invés de ter essa lista, a gente não vai usar essa lista, e vamos pedir para o próprio adapter, que é acessível, no nosso on-item click, que ele nos devolva esse item, a gente vai usar essa técnica agora, vou apagar essa referência para evitar essa situação que pode acontecer e a gente vai pedir para o adapter, ele que vai devolver o aluno escolhido. Com o adapter, o que a gente pode fazer? Tem alguns métodos relacionados com o item, algum método aqui que é o Get item at position, então quando a gente faz esse get item at position, o que a gente vai fazer? Mandar a posição do item, o argumento, o parâmetro, desculpa, e ele vai ter a capacidade de devolver o objeto que está naquela posição. Se a gente mandou essa lista para o nosso adapter, ele pega dessa lista, se mandarmos uma lista qualquer, ele vai pegar. O que estiver no adapter, ele vai pegar, e a gente protege mais em relação a essa peculiaridade, tentar mandar duas referências de lista, acaba pegando o objeto que não é nem o esperado, porque a gente abriu a possibilidade, nosso programa abriu a chance desse bug. Então, por isso faz todo o sentido manter dessa maneira, claro, o adapter view no geral é uma técnica na qual ele usa o object como padrão, podemos tentar modificar, talvez dê certo, ele está vindo com generics, não permite deixar apenas como interrogação, e sempre vai usar o object padrão, a gente não tem muito o que fazer mesmo, mas dessa maneira, garantimos que sempre o que tiver configurado no adapter no nosso listview vai ser retornado da maneira esperada, essa refatoracao, existe também esse cuidado, muito importante a gente tomar cuidado. Agora que a gente conseguiu colocar essa técnica aqui, outra ideia que podemos aplicar é a parte do intente, porque também estamos fazendo dentro do nosso listener, seria, por exemplo, da mesma maneira como fizemos o de inserção, podemos criar um novo, o abre, formulário. Só que se a gente colocar abre formulário, aluno, activity, fica meio redundante, e também não vai dar ideia do que ele faz, que é abrir o formulário para editar um aluno, então o que a gente pode fazer é o seguinte, abrir formulário, modo editar aluno. Nessa maneira fica muito clara que a ideia desse cara é editar um aluno de verdade, então a gente vai ter esse comportamento de edição, vou modificar o nome aqui para deixar apenas aluno para ser um a referência genérica, e agora ficou mais claro, no momento em que estamos clicando em cada um dos itens do nosso listview, no caso do nosso adapter view, vamos estar escolhendo um aluno, e também a partir desssa escolha do aluno, a gente vai abrir o formulário no modo editar aluno. É dessa maneira que a gente faz. E agora a gente tem essa string solta, podemos extrair para uma constante, ctrl-alt-C, vou chamar a constante de chave com maiúsculo, chave aluno, que dessa maneira a gente identifica o valor que a gente está mandando aqui refere-se à chave do aluno. Aí só um detalhe aproveitando que estamos fazendo a refatoração, também podemos modificar esse outro cara, que está bem genérico e podemos deixar da mesma maneira como está ali, esse cara é o abre formulário aluno activity, que ao invés de ser esse nome genérico, podemos colocar similar ao de edição, que seria abre formulário, modo, insere aluno. Fica muito claro o objetivo de abrir o formulário, e para o que vai ser usado. Conseguimos fazer a refatoração, para a nossa lista alunos activity, eu vou executar nosso projeto, ver se funciona da maneira esperada, comportamentos básicos, não vou testar de uma maneira profunda, porque essa refatoração não costuma ter impacto no código. Temos os mesmos comportamentos, vamos tentar abrir o formulário, abre bonitinho conforme nossa técnica de pegar diretamente do adapter, está bom? Só lembre que aqui vai sempre devolver um object e você vai ter que fazer o cast para o que você espera, se ele dentro do adapter não tiver o que espera, vai dar problema, é um cuidado a se tomar. Você vê e vai ser o problema de cast, não conseguiu dar um class cast e manda class cast exceptions. Finalizamos o list 1 do activities, agora vamos para o formulário aluno activity. Aqui dentro, uma das técnicas que faz todo o sentido a gente ver logo de cara com vocês, em relação a essa chave, porque essa chave, corremos um risco enorme de errar, de digitar, erro humano, acontece, então faz todo sentido manter uma constante, pegar a constante que criamos no activity, o chave aluno, está como pública e estática, conseguimos importar. Esse é o primeiro procedimento, quero que vocês deixem a chave como constante, porque evita o risco de erro de digitação, muito comum de acontecer. Só mais um detalhe, quando a gente quer manter essas constantes compartilhadas entre activities, costumo criar uma interface dentro do pacote de UI, que é onde estamo as activities, então UI.activity, e indicar que representa constantes de activities que serão compartilhadas entre elas, que dessa maneira não ficamos com uma única activities que vai manter constantes, ou uma outra vai manter várias ou menos constantes, então fica uma bagunça. Para isso eu crio uma interface, alt e setinha para baixo, interfaces, constantes, activities, e aqui eu deixo dessa maneira. Você pode deixar plural para não confundir com activity entidade do android, então você deixa constant activities, para poder indicar que são constantes de activities, esse é outro fator importante, tudo que você deixar com o sufixo activity, pode se confundir com a activity, entidade do Android, por isso faço no plural para evitar esse problema. Eu removo essa constante, coloco na nova interface, não precisamos nem manter public, static, final, porque ele já é isso como padrão, e agora eu faço uso nas nossas activities, certo, então, aqui na nossa lista eu faço o import dela aqui, import estático aqui, e no formulário também, import estático, conseguimos resolver esse problemão, vamos evitar o problema de digitação, fazemos o erro de digitação ter um problema. Agora, o que a gente pode estar fazendo aqui, dado que a gente está fazendo essa configuração toda bonitinha, podemos extrair para um comportamento maior, qual seria esse comportamento maior, o ctrl-alt-M ali, carrega aluno, a gente pode estar fazendo isso, ou então carregue informação dos alunos, da maneira que você preferir, vou deixar da maneira mais enxuta, porque tem outros passos ali dentro, que a gente pode até extrair para mais comportamentos. Então, seria o carrega aluno, porque no objetivo geral ele vai inicializar esse aluno para gente. Bacana, carrega o aluno, sempre vamos fazer depois que inicializar os campos, é um fator importante de considerar, e agora, o que vamos fazer aqui é justamente extrair mais comportamentos, quando preenchemos os campos, podemos extrair para outro método, o preenche campos, podemos extrair por outro método que seria o preenche campos, nada mais justo, a gente pode fazer isso sem problema. Agora temos um método bem enxuto e conciso, verificar que tem um extra, se tiver inicializar os alunos e preenche os campos, e se tiver faz a inicialização. Outro fator importante que eu quero mostrar para vocês, eu nem tinha comentado mas agora vou aproveitar e comentar. Percebe que na edição estamos colocando como novo aluno, e na inserção deixamos como novo aluno, sendo que na inserção deveria ser novo aluno, e na edição deveria ser edita aluno. Eu vou pegar nosso título que a gente está setando aqui, e vou migrar ele para que ele fique na parte de baixo, onde a gente consegue ter um modo de edição e de inserção, conseguimos garantir, e quando for um aluno que não tem um ID, um extra, vamos colocar no nosso título padrão, vou até mudar o nome para falar que é o appbar, novo, aluno. E quando isso não acontecer, certo, quando a gente tiver um extra, um aluno editável, vamos mudar para outro nome que seria, vou colocar o novo, vou atualizar, vou criar o novo, seria título appbar, edita aluno, vou pedir para ele criar a constante, ele criou, vou deixar como string porque queremos como string, e vou deixar como edita aluno, e dessa maneira a gente evita esse comportamento estranho que são títulos iguais para ações diferentes, você percebe que ele deixou como privado o novo, e o outro como público. Vou deixar privado. Vamos ver como ficou, se o código mudou alguma coisa, está tendo problema de compilação, ele não está compilando, porque ele fez um import estático e não conseguiu utilizar. Com ctrl-alt-O, ele otimizou e agora está compilando de novo, vamos testar e ver o que acontece. Agora a gente colocou esses títulos diferentes, vamos ver como ficou a diferença com esse código novo, se a gente tenta adicionar o novo aluno, vai ser o título anterior, agora se tenta editar, ele coloca editar aluno, ficou muito mais coerente. Continuando com a parte de fatoração, a gente vê que a gente carrega os alunos bonitinho, vou tirar essa linha, carrega aluno, a gente não tem nenhum problema e aqui a gente preenche aluno depois verifica se vai salvar ou editar, veja que tem um pouco mais de complexidade, então a gente pode indicar que vamos finalizar o cadastro, o formulário, então, a gente vai e coloca como método do formulário e chama de finaliza formulário que no finaliza formulário ele decide o que fazer, não a gente. Finaliza formulário e a gente sabe que vai finalizar, mas primeiro ele vai preencher os campos do aluno e vai decidir se vai editar ou salvar para depois finalizar, então realmente está bem coeso com o que a gente precisa, temos aqui o preenche aluno, o que preenche os a tributos conforme os campos, e a inicialização dos campos, que é o que a gente já viu. Então, nosso código está bem coeso, pode ser que seja grande, mas está bem dividido para o que ele faz, ele tem todos os comportamentos muito bem definidos. Agora, vamos voltar para nossa classe aluno, então, na classe aluno, temos nosso ID, nome, telefone, temos a sobrecarga e essa outra, e não tem problema, temos nossos getters e setters, ambos sendo usados, então tudo bem manter, temos nosso two-string, tem que realmente faz verificação do ID, agora, o que temos de novo? Nosso contador de ID, e aquele comportamento que atualiza ID, que eu comentei que faria sentido deixar dentro de um método, vamos extrair para esse método. Atualiza, e a gente deixa dessa maneira, podemos deixar um nome mais específico, como preferir, mas entenda que quando você chamar esse comportamento é porque quer adicionar novo ID, pode deixar com esse nome que tem esse tipo de significado. Da mesma maneira, o que podemos fazer é extrair alguns comportamentos, esse seria o interno nosso que é o edita aluno pela posição, vamos até extrair, edita aluno pela posição, se eu deixar dessa maneira, veja que ele pega os dois argumentos, não fica tão legal dessa maneira, vou pegar aqui esse código inteiro e não vai ficar legal, vai pegar sempre da maneira como está, deixar dessa maneira é suficiente, senão vai ficar estranho, se colocar outro edita vai ficar estranho, nesse não sei se vale a pena extrair, mas nesse acho que já vale, porque buscamos o aluno pelo ID, vale a pena. Ctrl-alt-M, busca aluno pelo ID. Aqui acho que dá para fazer. Ele está buscando, aluno encontrado, aí sim, se ele não for nulo, ele vai buscar a posição, agora sim faz todo o sentido, a primeira extração que fiz não ia ficar legal e não ia valer a pena, ia ter 2 argumentos de novo, mais complexidade. Da maneira como está é suficiente para atender a maneira como é esperado. Então, aqui na parte do edita foi tudo muito bem feito, na parte de busca também, podemos fazer uma técnica melhor, que é o famoso early return, quando a gente encontra aqui, a gente retorna o A, e quando não encontra, retorna nulo. Fica até mais fácil, quando você vê comportamentos assim, que você cria uma variável com inicialização não desejada para fazer uma interação com for para recuperar o valor, transforma num método e deixa early return, você pode fazer dessa maneira que não tem nenhum problema. Nosso aluno dao também está resolvido, podemos executar nosso projeto, é dessa maneira que vemos se funciona como esperado, vamos fazer os testes para ver se tudo funciona, e se a gente finaliza, a gente conclui que a tarefa foi feita. Para inserir novo aluno, vou colocar o Gui, telefone qualquer, só para ir rápido, teste bem simples, criei o Gui, bacana, vou clicar nele de novo e aparece as informações dele, agora 4, 5, 6, e vou deixar Gui Silveira, participando de novo com a gente, .com.br, para poder editar, vou clicar em salvar, salvou e está mantendo informações conforme esperado, agora sim a gente refatorou, finalizou bonitinho, colocamos até mesmo o título que não tínhamos dado tanta atenção antes e ficou bacana nossa parte do projeto, essa feature fechou da maneira esperada, então até já.

@@07
Aplicando a refatoração

Analise e refatore o código das classes envolvidas durante a implementação da edição de alunos: Aluno, AlunoDAO, ListaAlunosActivity e FormularioAlunoActivity.
Lembre-se de utilizar as mesmas técnicas vistas em curso, como é o caso de extração de métodos ou interfaces.

Para cada refatoração execute e veja se tudo funciona como esperado.

Nesta atividade são realizadas várias alterações em diversos pontos de código. Para deixar um feedback mais preciso sobre o que foi modificado, confira o commit via GitHub especificando todas as alterações.
É válido ressaltar que a refatoração não precisa ser feita apenas de um jeito, portanto, se você chegou a um resultado diferente porém, o código está bem organizado e compreensível, não tem problema.

https://github.com/alura-cursos/fundamentos-android-parte-2/commit/6d309e5546d0b21a2066eeabbbd1a4ca1661c254

@@08
Sobre cuidados com o extra

Quando começamos a implementar a edição do aluno na Activity de formulário, o comportamento de inserir um novo aluno quebrava o App. Por qual motivo isso acontecia?

Porque não usamos o extra ao abrir o formulário via FAB.
 
Alternativa correta
Porque comentamos o código de salvar o aluno no formulário.
 
Alternativa correta
Porque não verificamos a existência do extra no formulário.
 
Exatamente! A utilização de extra sem verificação corre o risco do extra não ser enviado e receber uma referência nula.
Alternativa correta
Porque esquecemos de colocar um log no listener do FAB.

@@09
O que aprendemos?

Nesta aula, aprendemos a:
Lidar de maneira adequada com extra;
Implementar comportamentos de edição;
Salvar e editar na mesma Activity de formulário;
Refatorar código.

####

@03-Removendo aluno da lista

@@01
Removendo aluno no DAO

Por mais que nosso aplicativo permita corrigir os possíveis erros dos nossos usuários, como também adicionar informações aos alunos, ainda tem um comportamento que ele não suporta e é muito comum em aplicativos, o de remoção. Ele se faz necessário quando a gente coloca registros que fazemos por teste e não queremos manter. Ou de repente você colocou 10 alunos e 5 deles não fazem mais parte da sua agenda, você não quer mais manter. Em outras palavras, esse tipo de comportamento é muito comum e esperado para os nossos usuários e faz todo sentido trabalhar em cima deles para adicionar em nosso aplicativo, e é isso que vamos fazer agora. Então, vamos começar a implementar o comportamento de remoção, dado que todas as features que a gente fez, foi feita com base em ação, float action button, e também para editar o aluno foi por meio de clique. Exploramos bastante nas duas opções o clique. E como que a gente pode colocar nova ação que vai permitir a remoção, dado que usamos o clique para alteração? No sistema android, temos outros tipos de ação que podemos fazer e que vai ter um listener atento para esse tipo de ação, dentre eles uma segunda opção que os usuários costumam fazer é clicar num elemento e segurar, conhecido como pressionar, essa pressão é outro tipo de gesto, ação, que existe um listener por trás que a gente pode estar adicionando comportamentos e vai ser por meio desse listener que vamos colocar o comportamento de remoção. Vamos trabalhar em cima dele, para isso voltamos na lista alunos activity, então lista, alunos, activity, e no momento que pegamos referência de nossa lista, que fazemos a configuração, podemos adicionar o novo listener. Dado que é um adapter view, vamos ter um set on item, e a partir desse set on item que vamos ver a nova possibilidade. Lista de alunos.setonitem. Se a gente ver aqui a primeira opção é justamente um item click listener, que foi o que a gente implementou para editar, e aqui embaixo tem esse outro carinha, o long, que representa justamente aquela pressão. Se a gente colocar isso, vamos ter a capacidade de pegar o listener que vai ficar atento com a parte de pressão, então vamos lá, vou fazer a implementação da interface que é justamente também a on item long click listener. Bem óbvio, dado que sempre que você tem o nome do seu setter, vem com o nome da interface da mesma maneira, então vou implementar a nossa interface, e ele tem uma interface muito similar ao que vimos no on item click, justamente os 4 parametros que se referem ao adapter view, a view, aqui a gente viu que é a posição, e por fim nosso ID, então aqui temos esses parâmetros acessíveis que podemos utilizar nesse evento. Dado que a gente implementou ele, vamos fazer um teste, colocando por exemplo, um log, para ver se está funcionando da maneira como comentei com vocês. Então, vou colocar um log i, esse template que temos, e vou registrar esse cara para identificar que foi um clique longo, essa pressão que foi feita, vou deixar como clique longo, e aqui vou deixar novamente a posição para gente sempre ter como referência para verificar se está pegando o aluno esperado, então aqui conseguimos colocar nosso log, vamos testar e ver o que acontece, aqui vou fazer o shift-F10, vou entrar no log-catch, e colocar o filtro para nosso aplicativo quando aparecer, então vamos ver se aparece aqui, enquanto está carregando, por isso que não apareceu, vamos esperar carregar e a gente coloca o filtro. Parece que está finalizando, então acho que vai ser possível, ele colocou o pacote, e agora coloquei no chão select application. Nesse primeiro log, a gente não precisa saber, dado que o log que a gente quer é quando faz uma iteração. Vou clicar, pressionar, e ele aparece, clique longo, 0. Então percebe que agora está funcionando. Se eu soltar, veja o comportamento que tem, ainda vai acionar o clique normal, e geralmente não é o comportamento esperado, dado que a gente fez outra ação, então não esperava a ação de clique. Por que isso acontece? É o seguinte, quando a gente faz um clique longo, principalmente quando implementa via essa interface, a gente tem a opção de consumir por inteiro esse evento ou então passar para frente, e por padrão, configurando dessa maneira, estamos passando para frente, e para poder alternar entre consumir esse evento inteiro ou então passar para gente, a gente modifica esse retorno, então, tudo indica que o falso, assume que você não vai consumir o evento todo, mas se deixar como true, indica que vai consumir e não passa para frente, então o clique normal não vai funcionar se colocarmos como true. Vamos testar e ver o que acontece, shift-F10, vou abrir nosso log-catch novamente, e vamos ver o que acontece. Perceba o seguinte, no momento que tiver implementando, essa parte do retorno vai ter esse impacto, se de repente você não tiver o comportamento esperado, fique atento aqui com esse retorno. Deixa eu limpar o log, vou pressionar novamente e soltar, já consumiu ali para ele mesmo e não deixou ninguém pegar, não passou para frente esse evento, até teve um comportamento diferente porque antes ele selecionava mais, e antes ficava na seleção, agora nem faz mais isso, seleciona o suficiente, faz o evento que tem que fazer, a ação, a configuração a mais do listener e já era. Da mesma maneira, se a gente for lá temos os efeitos da maneira esperada. Dessa maneira que trabalhamos com o clique longo. Agora, precisamos colocar o comportamento para remover o aluno, e para isso, a gente tem que remover do nosso dao, então nosso dao vai ficar responsável em fazer essa remoção, então vamos entrar, podemos pegar uma referência no dao que a gente quer remover um aluno a partir da posição, a partir do que a gente tem disponível, porque a gente trabalha com Ids, não faz sentido trabalhar com posição, vamos sempre mandar o aluno de acordo com o ID esperado. Então, deixa eu apagar aqui, e a gente vai fazer da mesma maneira como a gente fez nosso listener, que fazia o clique de item, vamos pegar aqui, vou apertar o ctrl-B que vai direto, pegamos a partir do adapter view, podemos usar o mesmo código, e vamos colocar aqui, para poder indicar que foi o aluno escolhido, a gente manda nosso aluno escolhido, e pedimos para o android studio, a partir do atalho alt-enter, criar esse método para gente, create method, remove, a gente coloca dentro do nosso dao. E agora que temos o método, vou deixar o nome genérico de aluno, e a gente pode começar a fazer nosso código. A gente faz da seguinte maneira, a gente busca o nosso aluno, a partir do método, busca aluno pelo ID, e aqui a gente manda o aluno como referência, ele manda uma nova referência que é o aluno dentro da lista, para poder remover ele, a gente tem o aluno devolvido, pode deixar com esse nome também, e agora a gente pode remover, então para remover é simples, a gente pega nossa listinha, indica que quer remover, poderia mandar vários argumentos, a posição ou o objeto, dado que a gente buscou o objeto dentro do remove ali, a gente pode remover ele, então aluno devolvido vai ser removido. A gente pode lembrar que esse nosso método pode devolver um nulo, então faz todo sentido antes de remover, fazer uma verificação, indicando “O aluno removido, se for diferente de nulo, você aplica a ação de remoção.” Então, com o ctrl-shift-seta para cima, eu coloco dentro do escopo do hífen, e agora colocamos esse comportamento. Podemos testar para ver se funciona da maneira esperada. Vamos ver o que acontece. Shift-F10, aguardar o android studio finalizar e verse funcionou da maneira esperada. Ele abriu para gente bonitinho, tranquilo, e agora vamos pressionar nosso aluno, vou pressionar o Alex. Não acontece nada, mas será que não aconteceu nada, eu vou clicar aqui na Fran, e vou voltar, e olha, ele realmente foi removido, em outras palavras, existem passos a mais que fazem sentido colocar para remover de fato, e agora que vimos isso, a seguir vamos ver como fazer esses passos a mais, preocupações a mais para remover de fato e ter experiência da maneira esperada, porque o que está acontecendo é que só estamos removendo no aluno dao, sendo que na verdade existem outras coisas para serem feitas, e a seguir vamos ver. Até já.

@@2
Aplicando remoção no DAO

Caso você precise do projeto com todas as alterações realizadas na aula passada, você pode baixá-lo neste link.
Ajuste o código para que o aluno seja removido no DAO. Para isso, no DAO, implemente o método remove() que recebe um aluno como parâmetro.

Nesta implementação, busque o aluno por meio do seu id e após garantir que ele existe, remova-o com o método remove() da lista de alunos.

Para testar o código, chame o método remove() do DAO dentro do onItemLongClick() enviando o aluno escolhido. Então, faça o clique longo no aluno, entre no formulário e volte.

https://github.com/alura-cursos/fundamentos-android-parte-2/archive/aula-2.zip



O App deve apresentar o seguinte comportamento:


O código para essa implementação ficou da seguinte maneira:

AlunoDAO.java:
public void remove(Aluno aluno) {
  Aluno alunoDevolvido = buscaAlunoPeloId(aluno);
  if(alunoDevolvido != null){
      alunos.remove(alunoDevolvido);
  }
}COPIAR CÓDIGO
ListaAlunoActivity.java:
private void configuraLista() {
    ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
    final List<Aluno> alunos = dao.todos();
    configuraAdapter(listaDeAlunos, alunos);
    configuraListenerDeCliquePorItem(listaDeAlunos);
    listaDeAlunos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
        @Override
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int posicao, long id) {
            Aluno alunoEscolhido = (Aluno) adapterView.getItemAtPosition(posicao);
            dao.remove(alunoEscolhido);
            return true;
        }
    });
}COPIAR CÓDIGO
Agora que aprendemos a remover o aluno no DAO, o próximo passo será a remoção via interface gráfica.

@@03
Removendo aluno por completo

Conseguimos remover nosso aluno diretamente no dao, mas não é uma experiência tão bacana para o usuário, afinal, para ele descobrir que o usuário foi removido, ele tem que fazer a pressão, o clique longo, entrar no formulário e voltar para a nossa lista para descobrir que o aluno foi removido. Em outras palavras, o ideal é fazer com que o feedback seja apresentado no momento exato que é removido de verdade, quando faz o clique longo, precisamos entender por que isso funciona, quando vamos para o formulário e voltamos para a lista e porque não funciona diretamente no dao. Como vimos quando estava fazendo a implementação do formulário, tivemos problemas de atualização, dado a questão de ciclo de vida, e a gente viu que para atualizar as informações, no momento que voltasse para a lista, tínhamos que usar o estado de resumo, on resume, então, on resume, olha o que fizemos, reconfiguramos a lista, por que fizemos isso? Na reconfiguração da lista, buscamos novamente todos os alunos ali no dao, ou seja, qualquer tipo de atualização que aconteceu ali, uma inserção, edição ou remoção, serão replicadas para nossa lista alunos activity, por isso que chamar novamente se torna viável para atualizar as informações para o usuário, portanto, uma solução inicial que poderíamos pensar é no momento que estou removendo, eu reconfiguro a lista, esse seria um passo inicial a considerar. Vamos fazer o teste e ver o que acontece. Shift-F10, vamos testar com a nova reconfiguração, que é no momento que faz o clique longo, vai remover no dao, e configuramos novamente a listview. Cliquei, pressionei, sumiu, essa é a maneira ideal, e sumiu. Agora sim, em comportamento, na parte visual, temos o comportamento ideal. Então, beleza, conseguimos colocar a feature de remoção, mas será que realmente estamos fazendo os passos ideais? Esse é um momento que quero mostrar para vocês que vai ser muito comum no dia-a-dia e que faz todo o sentido você como desenvolvedor android se conscientizar. Só funcionar, às vezes não é suficiente, porque às vezes você vai estar fazendo passos a mais que não deveria, o que quero dizer com isso, perceba que o que queremos de verdade é atualizar o nosso dataset, nosso conjunto de dados, dentro do adapter, e não buscar novamente nossa listview, não chamar novamente os nossos, aluno dao aqui, tudo bem, não ficar configurando o adapter novamente, e nem mesmo os listeners, essas configurações não precisam ser feitas constantemente, o que quero dizer? Existem outras técnicas que evitam que a gente faça toda essa configuração para atualizar o adapter. Afinal, o adapter é responsável em manter o responsável em manter o conjunto de dados para a listview, e da mesma maneira que tem a responsabilidade em manter, também tem de atualizar quando necessário. Portanto, o que vou fazer é uma técnica na qual vamos otimizar o que fazemos hoje, que é atualizar as informações, ao invés de fazer configurações a mais, vamos trabalhar diretamente com o adapter e fazer com que ele seja responsável por atualizar as informações. Para trabalhar com o adapter, a primeira coisa é ter acesso a ele, a configuração dele isola, não temos como acessar nos outros membros, por isso entramos em configura adapter, com ctrl-B, e faz com que essa instancia que a gente está mandando com o argumento do set adapter, seja um atributo de classe para que todos os membros acessem. Para ser tributo de classe, vamos chamar de adapter mesmo, não tem outro nome a mais que poderíamos colocar a mais que faça tanto sentido assim, e vamos usar para fazer a configuração. O que podemos fazer com nosso adapter? Ao invés de configurar a lista, podemos usar o adapter e usar um dos métodos, temos o próprio remove, se a gente colocar esse remove, indicando o objeto que queremos remover, nosso aluno escolhido, dentro do adapter, vamos ter a capacidade de fazer o comportamento de remoção, sem ter que fazer as configurações novamente. Vamos testar e ver o que acontece. Shift-F10, vamos agora verificar o comportamento e se mantem o esperado para o usuário, e o que a gente quer, que é remover de verdade os alunos. Ele removeu, da mesma maneira, removeu. Se a gente cadastrar o Gui novamente, deve apresentar o Gui e as outras informações não aparecerem. Vejam que a gente tem o mesmo comportamento. A diferença é que não estamos executando passos desnecessários, estamos executando o que precisa, atualização das informações contidas no adapter, como no nosso dao, então, todas as vezes que você fizer uma solução no android, tome cuidado com os passos que você faz. Funcionar não é o suficiente às vezes, precisamos analisar o que a gente fez, verificar se está otimizado o suficiente, e querendo ou não, aplicativos para android funcionam em dispositivos móveis, então quanto mais que a gente deixe nosso código otimizado, e que também facilite a manutenção, melhor. Veja que não foi doloroso, não foi ruim, não estava em high level e foi para low level, a gente fez uma coisa muito simples, foi exatamente o mesmo procedimento, mas estamos chamando de uma maneira ideal, mais inteligente, que evita executar passos que seriam executados de maneira desnecessária. Dado que temos esse feedback de que podemos usar o adapter de maneira mais inteligente, para evitar a execução de passos desnecessários, a seguir vou explorar mais a questão de passos desnecessários que estamos fazendo nesse momento e vamos tentar otimizar nosso código para executar de maneira esperada, fazendo com que os passos sejam executados no momento que for realmente necessário. Então até já.

@@04
Atualizando lista após remoção

Atualize a lista de alunos logo depois de remover o aluno no DAO. Para isso, extraia a instância do adapter para um atributo da ListaAlunosActivity. Em seguida, logo depois de remover o aluno no DAO chame o método remove() do adapter.
Execute o App e veja se funciona como o esperado.

O App deve apresentar o seguinte aspecto visual:


O código ficou da seguinte maneira:

public class ListaAlunosActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Lista de alunos";
    private final AlunoDAO dao = new AlunoDAO();
    private ArrayAdapter<Aluno> adapter;

    private void configuraLista() {
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        final List<Aluno> alunos = dao.todos();
        configuraAdapter(listaDeAlunos, alunos);
        configuraListenerDeCliquePorItem(listaDeAlunos);
        listaDeAlunos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int posicao, long id) {
                Aluno alunoEscolhido = (Aluno) adapterView.getItemAtPosition(posicao);
                dao.remove(alunoEscolhido);
                adapter.remove(alunoEscolhido);
                return true;
            }
        });
    }

    private void configuraAdapter(ListView listaDeAlunos, List<Aluno> alunos) {
        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos);
        listaDeAlunos.setAdapter(adapter);
    }

    // restante do código

}

@@05
Refatoração com otimização

Agora que vimos que é muito comum existirem passos desnecessários para o nosso código, vamos explorar um pouquinho mais do que a gente está fazendo e ver o que a gente pode estar otimizando aqui, está bom? Então, como a gente pode ver, um dos passos que a gente costuma executar mais de uma vez é justamente todo código contido aqui no on resume, afinal, quando a gente inicializar a nossa lista alunos activity, como também quando a gente vai para o formulário e volta para ela, ele é executado novamente. A gente precisa entender, a gente precisa saber quais desses comportamentos que a gente reexecuta a cada vez que a gente vai para o formulário e volta faz sentido a gente só executar, por exemplo, uma única vez. E, a partir desses conceitos que a gente vai aprender agora, a gente vai reformular o nosso código para que ele fique otimizado o suficiente. Vamos lá. Em relação a essa parte da busca, a gente não precisa fazer várias buscas para poder encontrar a listview que a gente quer, afinal, essa busca que a gente está fazendo vai manter sempre a mesma referência. Portanto, ela precisa ser feita apenas uma única vez. Da mesma maneira, quando a gente está buscando esses nossos alunos, a gente só está buscando eles novamente porque a gente está reconfigurando o nosso adapter e o nosso adapter também pode ser configurado apenas uma única vez. Veja que, também, os listeners não vão ter essa necessidade de fazer essa reconfiguração. Se a gente ver em um todo aqui, todos esses comportamentos que a gente está vendo aqui não precisam ser reexecutados, eles podem ser executados uma única vez, por exemplo, no on create, onde costuma ser executado uma única vez. O que a gente precisa explorar de verdade é o que a gente explorou no momento de remover, é o nosso próprio adapter. Então, vai ser o adapter, por exemplo, que vai ficar contido aqui no nosso on resume e vai simplesmente atualizar as informações que estão dentro dele. Por exemplo, quando a gente tiver uma atualização que foi feita lá no formulário - um aluno novo, certo? - A gente vai pegar o nosso adapter e vai falar: “olha, adapter, teve uma atualização nova. Limpe os dados que você tem e adicione todos os dados agora que estão contidos. Essa é uma solução que a gente pode estar aplicando e que evita toda essa reconfiguração. Agora que a gente entendeu sobre o que faz sentido ser executado e quantas vezes faz sentido ser executado, vamos migrar um pouquinho esse código e ajustar agora com essa refatoração. Vamos mandar esse nosso configuralista porque ele deve ser feito apenas uma única vez dentro do nosso on create. Logo depois que a gente configura o nosso dado, que é o nosso componente que a gente tem aqui, a gente vai fazer a configuração da nossa lista, que configura o adapter, que pega todos os alunos e faz as configurações da maneira esperada. Em seguida, o que a gente vai fazer? A gente, agora, vai notificar no resume que houve essa atualização no adapter, que vai precisar atualizar. Como eu comentei, a gente vai falar para o adapter: “olha, todos os dados que você tem aí, eles já não são válidos porque vai vir alguma coisa nova, tudo bem? Tem essa possibilidade. Então, você vai limpar todos os seus dados”, a gente chama o clear. Logo em seguida, a gente fala: “olha, agora que você limpou todos os seus dados, adicione novamente aqui todos os dados que estão contidos na fonte de dados segura”, que é o nosso dao. Então, a gente vai lá e chama o addAll. Com o addAll, a gente pega o nosso dao e chama o “todos”. Dessa maneira, a gente consegue fazer a configuração da maneira esperada, inclusive, agora que a gente está sempre adicionando, limpando o nosso adapter, e depois adicionando todos os dados, a gente nem precisa fazer essa adição dos dados do adapter quando a gente faz a configuração dele. A gente não precisa, por exemplo, ter que ficar pegando o nosso DAO dentro do nosso código da configuração da lista. A gente pode remover essa referência, não precisamos mandar para a configuração do nosso adapter porque também a configuração do nosso adapter não exige que a gente mande o data 7, a gente pode mandar sim o data 7, tudo bem? A gente pode estar fazendo isso. Aí, a gente coloca esse data 7 no momento que a gente faz o nosso on resume. A gente faz isso. Agora a gente remove esse parâmetro e vai adicionar esses dados exatamente no on resume. O on resume que vai ficar responsável em limpar o adapter com o que ele tem e vai adicionar as informações conforme necessário. Porque, como a gente sabe, o fluxo que a gente tem hoje, a gente entra no formulário, que pode alterar os dados que a gente precisa manter na lista. Dado que tem essa possibilidade, aí sim que faz sentido a gente adicionar de novo. A gente evita de reconfigurar diversas coisas que precisam ser feitas apenas uma única vez, não precisa ser feito mais de uma vez. Vamos executar o nosso código e vamos ver como vai ficar. Agora que a gente fez essa adaptação, que foi uma adaptação um pouquinho até grande, porque antes a gente migrou um pouquinho por causa do nosso fluxo, vamos ver se realmente funciona. A princípio, tudo funcionou, ele adicionou os elementos como eu havia comentado porque ele entrou agora no resume, ele limpou, caso existisse, algum tipo de dado e, depois, ele adicionou. Agora, vamos tentar fazer os comportamentos que a gente esperar. Primeiro, seria o “inserir”, certo? No “inserir”, a gente vai adicionar o Gui. Eu não vou colocar outras informações para ser um teste mais rápido. Ele foi lá e adicionou em nenhum problema. Da mesma maneira, se a gente tentar editar o Gui, vamos ver o que acontece. Ele vem com aquelas informações que a gente colocou primeiro, vamos novamente chamar o Gui Silveira e vamos colocar o telefone por exemplo, vou colocar até o mesmo telefone que eu estou colocando aqui para testar, e aqui eu vou deixar o e-mail do Gui. Então, eu vou salvar e vamos ver o que acontece. Ele foi lá e editou. Por fim, vamos testar a remoção. Remove aqui, beleza, removeu o Alex e removeu a Fran e removendo o Gui Silveira. Se a gente entrar no formulário e voltar, a gente tem exatamente o mesmo comportamento de antes. Qual é a diferença, o que a gente tem de ganho? A diferença, pessoal, é que agora a gente está fazendo um código bem mais inteligente, que faz a configuração necessária apenas uma única vez, porque é apenas uma única vez que ela é necessária, a gente não está fazendo etapas de maneira desnecessária e a gente está conseguindo utilizar o que é comum, realmente, de ser utilizado quando a gente trabalha com adapter views ou qualquer tipo de componente que tem um adapter, que é justamente o componente responsável por manter os dados, que é usar seus métodos, seja o de remover, seja o método de adicionar, limpar os dados, e assim por diante. Todas as vezes que você estiver trabalhando com adapter view ou qualquer componente que utilize o adapter, fique atento e utilize o adapter para fazer as operações comuns, que são conhecidas como CRUD, que é o create, o read, o update e o delete, que, traduzindo, ficaria: criação, atualização, remoção e também a alteração. Quando tem esses tipos de operação, pode usar à vontade o adapter, esse é o recomendado para poder manter e atualizar os dados da maneira esperada. Agora que a gente fez essas modificações, faz todo o sentido a gente aplicar algumas refatorações, afinal, não é uma refatoração tão grande. Já vamos aproveitar esse momento para aplicar essas refatorações. Uma delas que eu posso estar aplicando é justamente extrair todo esse código do nosso listener, da mesma maneira como a gente fez no clique normal. Então, ficaria... vou até pegar um nome similar colocando apenas a palavra “longo” para indicar que é o de pressionar. Configura o listener de clique longo por item. Agora, a gente deixa bem descritivo o que o método está fazendo. Dentro dele, também a gente pode extrair outros métodos, que seria, por exemplo, o remove. Então, a gente deixa esse remove, por exemplo, para o nosso activity, indicando que esse remove aqui vai remover um aluno, que indica também que vai remover o aluno da lista. Aqui, a gente pode até já deixar um nome genérico ao invés de ser “aluno escolhido” para apenas “aluno” e ele já deixa aqui bonitinho para a gente. Ele conseguiu fazer essa extração e agora a gente só precisa fazer uma extração aqui no nosso on resume, afinal, a gente tem um motivo para estar fazendo esses dois passos, que é limpeza e adição de todos os alunos, que é justamente atualização dos alunos. Então, atualiza alunos, é isso que a gente está fazendo. Agora, pessoal, vejam que o nosso código ficou bem mais simples em relação ao fluxo que ele está fazendo. A gente executa só uma única vez a configuração da lista que vai buscar o nosso listview, vai configurar o seu adapter, vai fazer configuração do seu listener tanto de clique quanto de clique longo e, dentro desses métodos, a gente vai ter os seus comportamentos específicos. Então, de clique por item, a gente já faz a abertura do formulário para editar, aqui no clique longo a gente remove o aluno que foi selecionado e assim por diante. Então, agora ficou muito mais simples, inclusive até no resume a gente atualiza os alunos. Agora a gente realmente tem um código que descreve o fluxo que é esperado com base no estado do ciclo de vida e também com base no que a gente espera, isso de uma maneira mais inteligente, sem executar passos desnecessários. Então, era exatamente isso que eu queria passar para vocês, que vai ser muito comum no seu dia-a-dia. Às vezes, você vai escrever um código que, aparentemente, já seja suficiente, já funciona, já mostra os comportamentos esperados, só que bem ali por debaixo dos panos, em algum momento na sua vida, ele vai te pegar de surpresa porque ele vai apresentar de repente uma lentidão, um possível bug, porque você não teve os cuidados da maneira que deveria ter. Era isso que eu queria passar, até mais.

@@06
Analisando e refatorando código

Refatore o código da lista de alunos visando evitar chamadas desnecessárias, como por exemplo a chamada de configuração da ListView mais de uma vez. Migre todo o código que precisa ser executado uma única vez para o onCreate().
Para manter a atualização de alunos na ListaAlunosActivity funcionando, utilize o adapter, fazendo a limpeza dos seus dados e buscando os novos dados contidos no ListView.

Lembre-se que o adapter não precisa da lista no construtor para que funcione, ela pode ser adicionada depois.
Após essa modificação, aplique técnicas de refatoração em blocos de código soltos, como é o caso dos códigos que utilizam o DAO e o adapter juntos.

Por fim, teste o App e veja se ainda funciona da maneira esperada.

O App ainda mantém o mesmo comportamento, a diferença é que agora utilizamos o adapter ao invés de reconfigurar a lista de alunos cada vez que se faz necessário.
Essa refatoração teve mudanças pontuais no código, sendo assim, deixo o commit que detalha os pontos exatos das mudanças).

https://github.com/alura-cursos/fundamentos-android-parte-2/commit/d436773f2dd6a582015993c3b5a008204343a61f

@@07
Sobre o uso do Adapter

Durante esta aula, resolvemos utilizar o Adapter para modificar o dataset (dados do adapter). Por quais motivos escolhemos essa abordagem?


Para evitar a execução desnecessária de passos que podem ser executados apenas uma vez.
 
Isso mesmo! Com o uso do adapter, é possível fazer a busca, inicialização de adapter e configuração de listeners para AdapterViews apenas uma única vez.
Alternativa correta
Para permitir que a configuração da lista de alunos seja feita no estado de criação da Activity.
 
Exatamente! Ao considerar o uso do adapter, não precisamos criar um novo adapter para atualizar o dataset, dessa forma, podemos configurar na criação da Activity.
Alternativa correta
Para permitir a atualização da lista de alunos sem apresentar dados inconsistentes.
 
Alternativa correta
Para evitar referências nulas ao atualizar a lista de alunos cada vez que entra no onResume().

@@08
O que aprendemos?

Nesta aula, aprendemos a:
Implementar a feature de remoção em AdapterViews;
Analisar e refatorar códigos que não precisam ser executados mais de uma vez;
Utilizar a referência do Adapter para manipular os dados do AdapterView

#### 10/09/2023

@04-Aplicando menus do Android

@@01
Criando menu de contexto na ListView

Implementamos o CRUD no nosso aplicativo, porém, o comportamento de remoção de alunos é um comportamento que temos que dar um pouco mais de atenção, pensando na melhor experiência para nosso usuário, pelo seguinte fato, hoje como que a gente faz para remoer um aluno, a gente vem aqui, clica, segura, que é a pressão, e ele remove. Mas se o usuário estiver explorando nosso aplicativo, não tem a mínima ideia como funciona e tem curiosidade, ele pode cometer um erro, ou uma ação indesejada, nem um erro, porque estamos colocando a culpa no usuário se a gente fez o produto, ele pode ter um comportamento inesperado. Perder dado valioso dele, porque o aplicativo não mostrou para o usuário que ele iria remover o dado, ele simplesmente removeu. O que quero dizer é que ações que são perigosas, grande impacto para as informações de usuário, precisamos colocar uma camada a mais que vai mostrar para o usuário o que ele está prestes a fazer, então, ao invés de ser objetivo e remover, precisamos de alguma maneira avisar o usuário que é algo perigoso e que ele tem chance de perder os dados ou se é isso mesmo que ele quer. E para isso temos diversas opções usadas em Android. O que é bem comum é o que costumamos fazer em sistemas operacionais que utilizamos em computadores, Windows, Linux, ou Mac. Justamente o famoso botão direito, então se a gente vem aqui no projeto, nesse diretório app, e apertar o botão direito, a gente tem um monte de menus de possibilidades que podemos fazer, esse menu é conhecido como menu de contexto e no android também temos acesso a esse tipo de menu, e é por meio dele que podemos explorar essa feature para melhorar a experiência do usuário, vamos então implementar. Como que podemos implementar um menu de contexto quando tentarmos fazer essa ação de pressionar e tentar remover o aluno antes mesmo de fazer a remoção? Para isso, vamos no activity, lista alunos activity, vou estender nosso código e a partir dela podemos começar na criação. A criação de menu de contexto é muito similar quando queremos modificar um comportamento do ciclo de vida, a gente vai ter que sobrescrever o método responsável pela criação de menu de contexto responsável pela activity, o famoso oncreate context menu, a partir dele, vamos ter a possibilidade de adicionar menus de contexto à nossa activity, para isso podemos usar esse parâmetro que é nosso contexto menu, a partir do object menu, e adicionar wedge, um método que tem sobrecargas, entre as opções, a mais objetiva para o que precisamos é a que pode ser uma string, que aqui só vamos colocar o nome do menu que esperamos, o remove, ou remover, então vamos deixar como remover, que a gente pode estar utilizando da nossa língua portuguesa. Bacana, a gente criou o menu, mas apenas criar não é o suficiente, porque ele deve ser acionado de uma ação de alguma view, da mesma forma que a gente seta um listener, a gente precisa setar esse menu de contexto a uma view, para isso temos o método da própria activity, que é o register for contextu menu, que vai esperar que envie como argumento uma view dentro do nosso layout, então a gente podia registrar nosso float acton button ou a listview. Logo, vamos pegar esse register for contexto menu que está aqui no oncreate, vamos entrar no configura lista, que é onde a gente busca o listview, depois o adapter e os listeners, e vamos registrar a lista, indicar que a lista vai ter um registro de um context menu. Você pode estar pensando, a listview é adapter view e vimos que teve problemas quando tentamos colocar listener direto nela, ela tem suas views filhas, e não deixou fazer implementação de um listener de clique diretamente nela. A gente vai ter esse problema? Nesse caso não, porque o register for context menu está configurado suficiente para que quando receba uma viewgroup ele seja capaz de colocar nosso contexto menu para cada um dos elementos filhos, caso da listview, cada item faz parte de um filho seu. Então, ele está preparado para isso, a documentação garante para gente. Sendo assim, podemos fazer um teste, shift-F10, vamos abrir nosso emulador, e ver o que acontece após a execução do android estúdio. Está finalizando, abrindo nosso aplicativo, e se a gente tentar remover um aluno, ainda vai remover e não vai apresentar nenhum tipo de feedback. Por que isso acontece? Porque o context menu é acionado quando fazemos a pressão, a partir de um clique longo, mas temos implementação de clique longo, essa que é meio que guloso, só pega o evento para ele, não passa para as demais entidades que também tratam desse evento, e o contexto menu faz parte dessas entidades que vai assumir esse evento. Para a gente conseguir acionar, é deixando como falso e passando para frente. Shift-F10, vamos testar, ver se agora pelo menos aparece e a gente conclui que é dessa maneira que precisa ser feito. Está finalizando a execução, vamos pressionar novamente, ele remove. Mas ao mesmo tempo, apresenta o menu de contexto. Uma curiosidade, bacana, o contexto menu acaba sendo o guloso da vez, ele não faz com que o clique normal pegue o evento, não passa para frente, ele pega para ele e consome o clique longo, que seria o clique normal. Agora, conseguimos entender como funciona o menu de contexto, e dado que a gente só quer remover após clicar em remover de verdade, não precisamos manter esse comportamento da configuração do listener de clique longo por item, porque não vamos mais fazer a execução de remoção de cara, vamos esperar o usuário decidir o que ele quer, e conforme ele decidir, executamos no código, então o primeiro passo vai ser remover o comportamento não desejado, estou removendo aqui, bacana.

@@02
Adicionando o menu de contexto

Caso você precise do projeto com todas as alterações realizadas na aula passada, você pode baixá-lo neste link.
Crie um menu de contexto que apresente a opção de remover o aluno. Para isso, dentro da ListaAlunosActivity sobrescreva o método onCreateContextMenu(), então, com o parâmetro ContextMenu, chame o método add(), enviando o título "Remover".

Registre o menu para a ListView por meio do método registerForContextMenu() logo depois de realizar todas as configurações.

Por fim, remova todo o código de configuração do listener de clique longo da ListView.

https://github.com/alura-cursos/fundamentos-android-parte-2/archive/aula-3.zip

O App deve apresentar o seguinte aspecto visual:


Em código tivemos o seguinte resultado:

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("Remover");
    }

    private void configuraLista() {
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        configuraAdapter(listaDeAlunos);
        configuraListenerDeCliquePorItem(listaDeAlunos);
        registerForContextMenu(listaDeAlunos);
    }

    // restante do código

}COPIAR CÓDIGO
Lembre-se de remover o código que configura o listener para clique longo.

@@03
Implementando listener no menu de contexto

Agora que a gente removeu esse comportamento, a gente precisa aplicar um certo tipo de listener, aplicar um comportamento a mais quando a gente seleciona o menu. E como é que a gente faz isso? Se a gente pensar no que a gente fez até o momento, a gente pensaria em fazer um setListeners, certo? Só que, no menu de contexto, a gente também vai ter um método, que é da própria activity, que é responsável em pegar todos os menu de contexto que foram acionados. Então, se você acionar um menu de contexto qualquer, ele vai chamar esse método. É dessa maneira que a gente acaba colocando um listener nos nossos menus de contexto, que é a partir do “on item” ou “on... sempre confundo, é “on context”, agora sim: “on context item selected”. Quando a gente coloca esse “on context item selected”, estamos indicando que qualquer tipo de menu de contexto que for selecionado, clicado, da maneira que você preferir chamar, ele vai chamar esse método e a gente pode estar executando da maneira esperada. Nesse caso, o que a gente quer fazer, pessoal? A gente quer pegar as informações do menu que vão indicar exatamente o aluno que foi selecionado e que ele realmente quer remover. Então, a partir dessas informações, a gente precisa remover esse aluno. Só que como que a gente vai fazer isso? Antes, aqui nos nosso métodos, que a gente tinha nos nossos listeners, a gente tinha acesso, por exemplo, a um adapterview, a gente tinha acesso a uma posição e aqui a gente só tem acesso ao menu item, que é justamente o que representa de menu, que é aquele menuzinho lá do menu de contexto. O que a gente pode estar utilizando aqui para poder pegar essas informações? Para isso, a gente tem mais um objeto que é conhecido como menu info e esse menu info vai ter a capacidade de nos dar mais informações. Se a gente chegar aqui e colocar o item e pedir o menu info, a gente vai ter mais informações capazes de nos ajudar. Então, get menu info. Só que tem um detalhe: o menu info, aqui para o padrão, ele não dá tanta informação que a gente precisa, sendo que a gente precisa de uma informação do adapter. Para isso, a equipe do android criou um menu info específico para os adapters. Então, se a gente chegar aqui e tentar fazer uma conversão como um cast do adapterview, adapter context menu, e realmente usar esse menu info agora, a gente vai ter acesso a essas informações que a gente precisa. Como eu comentei: a gente precisa converter esse menu info genérico para esse menu info específico. É claro, isso só vai funcionar se realmente a sua view que você registrou for uma adapterview, caso contrário, você não vai ter esse funcionamento, vai dar ali uma exception. Então, esse é um fator importante. A gente já está garantindo que isso é verdade, a gente está assumindo para o nosso código, para o android que isso é verdade e, por isso, agora, a gente vai ter acesso às informações contidas no adapterview quando a gente se relaciona com o context menu. Quais seriam as informações que a gente pode ter acesso aqui, pessoal? Dentre elas, por exemplo, a gente pode pegar a posição do nosso elemento, que é uma informação importante porque, a partir da posição, a gente pode, por exemplo, o nosso adapter e pedir um aluno. Então, a gente pode falar para ele falar o seguinte: get... a gente tem o “get item” porque “item” é justamente o item a partir de uma posição que vai ser devolvido. A gente pega o nosso menu info e fala: “pega a posição do item que foi tocado a partir desse menu de contexto”, ele vai lá e nos devolve aqui um aluno - “aluno escolhido”. Agora que a gente tem o aluno escolhido, basta a gente chamar o nosso remove. Então, “aluno escolhido” e vai lá e remove. Então, é basicamente essa maneira que a gente trabalha com os nossos menus de contexto. A gente acaba tendo o nosso listener, que pega qualquer tipo de menu de contexto, dado que a gente está precisando da informação do adapterview, a gente consegue pegar o menu info e converter para o menu info do adapterview; e, depois, a gente pega a posição, que é o que a gente precisa, a posição do elemento que foi selecionado, que foi que usou o menu de contexto, e podemos explorar o nosso adapter para recuperar esse aluno, e depois fazer o que quiser. Nesse caso, a gente só quer remover. Então, agora que a gente fez todos esses passos, vamos testar novamente. Shift f10, lembrando que agora a gente não vai ter mais o comportamento do nosso clique longo porque a gente removeu, então remova aí também quando você fizer, agora a gente não tem mais, e vamos testar para ver o que acontece. Agora, eu vou clicar aqui no aluno, ele vai aparecer o menu de contexto. O primeiro teste que eu vou fazer é clicando em nada para ver o que acontece. Não aconteceu nada. É o esperado. Agora, eu vou clicar aqui e vou clicar em remover. Olha só, ele foi lá e removeu. Percebe que dessa maneira a gente aumenta a flexibilidade, a gente aumenta a segurança que o usuário vai ter no nosso aplicativo, ele vai ter mais segurança do que ele está fazendo, ele não vai ficar preocupado em perder as suas informações, que é uma coisa horrível, é uma experiência que ninguém precisa ter, não faz sentido alguém ter medo de usar o nosso aplicativo, ele tem que ter consciência, ele tem que ter a segurança de que o que ele está fazendo é muito bem claro, é muito bem definido. Por isso que, quando tiver features mais impactantes, mais perigosas, você precisa dar esse cuidado a mais, essa atenção a mais ao usuário. Se a gente entrar aqui no formulário, voltar para cá para ver se não deu algum tipo de bug, a gente percebe que funcionou. Se tentar remover a Fran, vai lá e funciona. Agora sim, a gente conseguiu melhorar um pouco mais a experiência do nosso usuário em relação a como ele mexe no nosso aplicativo. Até já.

@@04
Aplicando listener no menu de contexto

Adicione o comportamento que remove o aluno da lista no listener do menu de contexto. Para isso, sobrescreva o método onContextItemSelected(). Dentro dele, busque o aluno que foi tocado a partir do parâmetro MenuItem, com ele é possível acessar o MenuInfo por meio do método getMenuInfo().
Considerando que as informações do menu está relacionado ao AdapterView, converta o MenuInfo via cast para AdapterView.AdapterContextMenuInfo.

Então, com essa nova referência acesse a posição do elemento a partir do atributo position, e então, pegue o aluno a partir do método getItem() do adapter.

Por fim, chame o método remove() enviando o aluno que foi selecionado. Teste o App e veja se a remoção funciona a partir do menu de contexto.

O App deve apresentar o seguinte aspecto visual:


Em código temos os seguinte resultado:

public class ListaAlunosActivity extends AppCompatActivity {

  @Override
  public boolean onContextItemSelected(MenuItem item) {
       AdapterView.AdapterContextMenuInfo menuInfo =
               (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
       Aluno alunoEscolhido = adapter.getItem(menuInfo.position);
       remove(alunoEscolhido);
       return super.onContextItemSelected(item);
   }

   // restante do código

}COPIAR CÓDIGO
Agora o App remove os alunos de maneira adequada.

@@05
Criando o menu via arquivo XML

Agora que implementamos o primeiro menu de contexto, vou aproveitar o momento para falar sobre boas práticas e cuidados que precisamos ter nesse tipo de solução, dentre essas possibilidades, um dos primeiros passos que precisamos verificar é em relação ao que a gente fazia com o layout, a gente criava o layout via código java de maneira programática e depois migramos para uma solução na qual deixamos o layout num arquivo estático para dividir a responsabilidade de criação e utilização na activity, em menus também vamos ter o mesmo comportamento, ao invés de criar o menu de maneira programática, de repente é um menu complexo, o código vai ficar complexo, a gente joga toda a complexidade para o arquivo estático, fixo, e assim reutilizamos o arquivo, então agora a gente vai migrar a solução para um arquivo estático. Vamos lá. Para isso, vamos no nosso projeto, no diretório res, só que agora não tem um diretório destinado a menus, da mesma maneira como não tinha para layout, ou seja, vamos criar um diretório do android que vai ficar destinado a menus, para isso a gente vem e usa o alt insert, e usamos a opção android source directory, e dentro dela, temos a opção resource type que fala o tipo de diretório que a gente está querendo criar, vimos que tínhamos o de layout e também temos o de menu, então a gente toca no de menu, percebemos que ele sugere o nome menu, vamos mantê-lo e clicar em ok. Agora sim temos nosso diretório. Para criar nosso menu, utilizamos alt insert de novo e a opção que ele dá é menu resource file, que ele vai criar um arquivo de menu com template esperado para menus, aqui vamos colocar o nome de arquivo, podemos usar a mesma técnica para layouts, usando o nome de activity, fica activity lista alunos, e como sufixo a gente deixa menu, que a gente já entende que o arquivo é destinado a menu. Agora que temos o menu, perceba que no código fonte ele cria a DSL, usando o elemento chamado de Menu. Se a gente vem no editor visual, vamos ter um comportamento muito similar como tínhamos do layout. Sendo assim, vamos utilizar o editor visual para ver o feedback que a gente tem, e depois vemos o código fonte em xml que foi gerado. Nessa parte do editor visual temos as paletas com as opções disponíveis, e queremos adicionar um menuzinho, o item, para isso, podemos escolher a opção menu item, clicar, segurar, arrastar, e soltar dentro do nosso preview, e ele mostra que adicionou um menu. Perceba que ele mostra que adicionou um menu na app bar, esse vai ser o comportamento comum, afinal como comentei, menus existem de sobra no android, e aqui o que estamos usando é o de contexto, aqui é o normal que não tem nome especifico, apensa menu que vai estar mantido na nossa app bar, e por isso esse é o padrão a ser mantido, mas nada impede de usar o menu dentro de um menu de contexto e por isso que não tem nenhum tipo de problema. Beleza então, ele está mostrando o que vamos ter no nosso menu, e vamos ter a capacidade de editar o menu também, com as possíveis opções que ele nos disponibiliza, dentre elas a mais importante de todas, que ele precisa ter um título, que esse layout que a gente está criando para os nossos menus, ele funcione. Ou seja, se a gente chegar no title, que é o atributo de menu, e apagar, ele vai reclamar falando que a gente precisa ter um título específico para o menu, então todas as vezes que você for criar um menu dentro do arquivo estático, sempre adicione um título, ele vai sempre reclamar. Então, vamos colocar nosso título, que a gente espera, que é o remover. Agora, conseguimos criar nosso menu, é bem simples. Se a gente vê nosso código fonte, perceba que deixamos da maneira esperada, só colocando o item dentro do componente menu, e temos a mesma ideia de nível de hierarquia, o menu seria o elemento raiz. Bacana, só para vocês verem, se a gente não tiver título, vai sempre reclamar. Esse é o primeiro detalhe e o único que temos que ter preocupação ao criar o menu. Agora que temos o menu, precisamos fazer exatamente como fazíamos com o arquivo de layout, precisamos de alguma maneira pegar o arquivo de menu e fazer com que ele seja vinculado à activity, nesse caso, a activity usa uma técnica muito comum dentro do android, conhecida como técnica de inflar, o que isso significa? Significa que ele vai pegar ali o nosso arquivo estático, o que a gente tem nos nossos resources, e transformar esse arquivo em objeto de menu, por isso inflar. Esse é o procedimento de inflar. Mas como podemos fazer esse procedimento dentro do android, dentro da nossa activity? Para isso, temos um inflador, de menus, e a gente pode pegar ele, a partir do método getmenuinflator, então esse vai ser o cara que vai ficar responsável por inflar menus, ele utiliza um método chamado de inflate, que vai receber o arquivo estático de menu, e o menu que ele vai atrelar esse processo de inflar, então a gente vai colocar nosso menu aqui, nosso arquivo de menu que a gente criou agora e vincular ao menu de contexto, porque como vimos, não existe só o menu de contexto dentro do activity, pode ter outros menus, então a gente vincula ao esperado que é o menu de contexto recebido via argumento. Então, agora, conseguimos fazer o processo de inflar, e espera-se que no momento de executar, apareça o menu que a gente criou lá. Então, agora vou executar para gente ver, shift-F10, e vamos ver o que acontece. Deixa eu abrir nosso emulador, está conseguindo carregar sem nenhum problema. Agora vou clicar, segurar, ele mostra o menu para gente, remover, ele foi lá e removeu sem nenhum problema. Agora, pessoal, vamos só editar esse arquivo para ver se funciona, se está refletindo o conteúdo que tem no arquivo estático, então vou dar um ctrl-B e adicionar um novo menu, agora vou adicionar um novo menu a partir do item usando código fonte, item eu coloco um title, e vou colocar como teste só para ver o novo item, e ele mostra novamente como fica, está mostrando para gente. Vou executar aqui e vamos ver o que acontece. O que deve acontecer é que quando a gente clicar, ele vai mostrar todas as opções disponíveis a partir do menu que criamos. Ele vai lá e aparece, então temos aqui o remover e o teste.

@@06
Criando menu de contexto via arquivo estático

Faça com que o menu seja criado a partir de um arquivo estático contido no diretório res.
Para isso, primeiro crie um diretório do Android com o nome menu. Então crie um arquivo XML de menu com o nome activity_lista_alunos_menu.

Adicione um menu com o título "Remover" e com um id. Você pode adicionar o menu via editor visual ou código XML. Lembre-se que no editor o item é chamado de Menu Item e no XML apenas <item>.

O id pode usar o mesmo padrão que utilizamos nas views do layout estático.
Dentro do onCreateContextMenu(), ao invés de adicionar o menu manualmente, faça o processo de inflar menu por meio do método inflate() do MenuInflater().

Para acessar o MenuInflater, você pode usar o método da Activity getMenuInflater().
Teste o App e veja se funciona como esperado.

Visualização de menus no AS 4.1
A partir do AS 4.1 além do arquivo de layout, o arquivo de menu também disponibiliza abas novas:

Code: Código fonte do menu
Split: Código fonte do menu e preview
Fique à vontade para editar o menu com a aba de sua preferência.

O App deve apresentar o mesmo aspecto visual, a diferença é feita na estrutura do projeto e no código, segue abaixo a nova estrutura do diretório res:
res
├── drawable
├── layout
├── menu
├── mipmap
└── valuesCOPIAR CÓDIGO
Um arquivo de menu exclusivo para o menu da ListaAlunosActivity:

activity_lista_alunos_menu.xml:
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/activity_lista_alunos_menu_remover"
        android:title="Remover" />
</menu>COPIAR CÓDIGO
Então ficamos com a seguinte implementação na Activity:

ListaAlunosActivity.java:
public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater()
                .inflate(R.menu.activity_lista_alunos_menu, menu);
    }

    // restante do código

}

@@07
Adicionando filtro no listener de menus

Agora um outro detalhe que é o que eu vou mostrar para vocês logo a seguir é o seguinte: o que é que se espera quando a gente clica aqui nesse teste? A gente não quer que acontece nada, afinal a gente não configurou nada para esse teste, mas vamos ver o que acontece, clicando aqui ele foi lá e removeu, porque é que ele removeu, pessoal? É justamente por aquele detalhe que eu comentei com vocês, quando a gente implementa aqui um menu e utiliza aqui esse listener do menu, que é justamente é o método onContextItemSelected todos os menus de contexto, nesse caso aqui, eles vão acionar esse método, ou seja, ao invés de colocar uma ação genérica para todo mundo, a gente só pode colocar essa execução de remover quando a gente tiver certeza que foi o menu de remover que foi tocado, justamente pelo fato de que qualquer menu que for acionado a partir do menu de contexto ele vai entrar aqui dentro desse método. Então essa é a outra boa prática que a gente precisa ter que também reflete ao cuidado que a gente precisa ter. Então se você vai colocar um comportamento dentro de um listener do menu você tem que fazer algum tipo de checagem, alguma verificação para garantir que o menu que foi tocado é realmente o que você espera, está bom? Então agora a gente vai trabalhar em cima disso. Como a gente pode saber se foi exatamente o menu de remover que foi tocado aqui nesse caso, certo? Para isso a gente vai conseguir verificar a partir do nosso menu item, porque é ele que representa o menu que foi tocado, então se a gente usar esse objeto a gente percebe que a gente tem diversos métodos para poder pegar alguma informação dele, dentre elas a gente tem, por exemplo, o getTitle que vai ter exatamente o título que a gente colocou aqui no nosso menu, tudo bem, então seria o de remover. Então uma das possibilidades seria o seguinte: a gente pegaria esse título do nosso menu, certo? Então título do menu e verificaria se ele bate com o menu que a gente espera, então, por exemplo, o título do menu eu vou colocar equals porque a gente está lidando com string, é uma referência, certo, é um objeto, eu vou colocar equals remover. Então a gente está verificando se ele bate com o remover, e se isso for verdade aí sim a gente faz todo o código de remoção aqui do nosso aluno, certo? É isso que a gente espera. Agora vamos testar e ver o que acontece, agora que a gente conseguiu fazer esse filtro, agora que a gente só vai executar essa remoção apenas quando a gente tiver certeza que é o menu de remover e não qualquer outro menu a gente vai ver se realmente atende esse comportamento. Então o de remover ele foi lá e funcionou, agora o de teste vamos ver, ele vai lá e não remove, está bom? Então é dessa maneira que a gente acaba trabalhando com menus, então vai ser muito comum você ter diversos menus que vai ter diversos comportamentos diferentes, e para você delegar o comportamento esperado é fazendo esse tipo de filtro, é você colocando o if, de repente o sweet case, da maneira que você preferir, está bom? Aí é claro, pessoal, a gente não vai ficar lidando com strings, afinal a gente tem ali poder do nosso arquivo de layout e a gente sabe que a gente tem os IDs, então a gente pode estar usando aqui IDs e é o recomendado de ser usado ao invés de ter que estar usando aqui um texto, afinal um texto, uma string ela pode estar mudando a qualquer momento, de repente hoje a gente coloca como remover, mas o nosso cliente ele espera que seja deletar. A gente vai ter que se preocupar tanto aqui no nosso if como também aqui no nosso título remover aqui que está dentro do nosso arquivo de layout, layout não, de menu, costumo falar layout porque ele está dentro do arquivo de estático. Então sendo assim a gente vai colocar agora IDs para os nossos menus, então eu vou chegar aqui no nosso menu e da mesma maneira como a gente faz em uma view, a gente coloca o ID, o @ID e vamos usar aqui a técnica para adicionar os nossos IDs, que vai ser o activity, mesma técnica do nome, activity lista alunos menu e aqui eu vou colocar remover, está bom. Então quando a gente coloca esse ID a gente já vai ter a capacidade agora de, ao invés de usar aqui o nosso título, a gente vai pegar aqui do nosso item o ID, então getItemID, então quando a gente pega aqui o ID a gente vai ter a capacidade de fazer aquela comparação, podemos até chamar de ItemID mesmo, não tem nenhum problema. E não vamos mais usar aqui a referência via string e sim a referência via ID do Android, que a gente vai verificar: olha, o ItemID ele bate com o R.ID activity menu remover? Sim, ele bate, se ele bater aí ele vai lá e entra aqui no nosso código, se não ele não faz nada. Aí podemos tirar esse código aqui que pegava aqui o título e agora sim a gente vai fazer de uma maneira mais adequada, que evita os possíveis problemas aí existentes. Vamos só executar, ver como é que fica aqui, se ele realmente está funcionando, tudo que você modificar sempre vai executando, testando e ver se ele bate com o esperado está bom, e aí se tudo tiver certo a gente já pode prosseguir com o restante, está bom? Então vamos só verificar aqui, bacana, ele está funcionando e aqui ele está aparecendo o menu, vamos tocar no remover, funcionou, vamos tocar no teste ele não funcionou, que é o que a gente espera. Então agora sim a gente tem um comportamento esperado e agora que a gente conseguiu fazer isso a gente nem precisa mais manter aqui o nosso teste. Então basicamente eram esses os detalhes que eu queria passar para vocês em relação a implementação de menus, a gente tem até mesmo o name space de app aqui que a gente nem usa, podemos apagar, não em nenhum problema, ctrl para ele poder formatar aqui o nosso código layout e basicamente é isso, pessoal. Então sempre que você for usar um menu de contexto sempre fica atento com o detalhe de você fazer o inflate, que é o processo de inflar menus a partir de um arquivo estático, de você colocar um filtro dentro do seu listener de menus, que no caso seria o OnContextItemSelected para o menu de contexto, e aí depois que você identifica isso você vai lá e executa conforme o menu que foi selecionado, está bom? Então sempre fique atento com isso. Até mais.

@@08
Aplicando filtro no listener do menu de contexto

Aplique um filtro no menu de contexto usando o id como referência. Para isso, no onContextItemSelected(), adicione um if que verifica se o id do item é o mesmo que foi configurado no arquivo estático, então, dentro do escopo do if, adicione o código de remoção para que seja executado somente quando o menu de remover for tocado.
Você pode usar o id do menu como uma referência para saber que ele foi tocado.
Após implementação, teste o App e veja se o menu ainda funciona como esperado.

Uma abordagem de teste bacana, é adicionar mais um menu no arquivo estático e verificar se ao ser tocado ele não executa o comportamento de remoção.

Não houve mudanças visuais, porém o código do listener ficou da seguinte maneira:
ListaAlunosActivity.java:
public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        if(itemId == R.id.activity_lista_alunos_menu_remover){
            AdapterView.AdapterContextMenuInfo menuInfo =
                    (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
            Aluno alunoEscolhido = adapter.getItem(menuInfo.position);
            remove(alunoEscolhido);
        }

        return super.onContextItemSelected(item);
    }

    // restante do código

}COPIAR CÓDIGO
Com esse ajuste garantimos que apenas o item "Remover" realiza a ação que remove o aluno de vez.

@@09
Sobre o uso de filtros para menu

Na implementação do listener para o menu de remoção, utilizamos o filtro... Por qual motivo consideramos essa abordagem?


Devido à migração para a arquivo estático, o App quebra sem o filtro.
 
Seja via código Java ou arquivo XML, o menu tem o mesmo comportamento, portanto, esse não é o motivo para considerar o filtro.
Alternativa correta
Para compartilhar o mesmo comportamento entre as opções do menu de contexto.
 
Muito pelo contrário! A ideia de usar um filtro é evitar que um comportamento que deve ser exclusivo de um menu seja executado quando outro menu for acionado.
Alternativa correta
Porque o Android Framework quebra e sugere a implementação do filtro.
 
Dependendo do que for implementado, pode quebrar o App, porém, esse não é o real motivo para considerarmos o filtro para menus.
Alternativa correta
Para que seja executada a ação esperada para o menu filtrado.
 
Exato! Com essa abordagem evitamos que um comportamento seja executado quando outros menus dentro do menu de contexto forem acionados.

@@10
O que aprendemos?

Nesta aula, aprendemos a:
Implementar menu de contexto;
Criar menus via arquivo estático;
Realizar o processo de inflar menu;
Configurar listener de menu adequadamente.