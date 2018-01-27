
use mozdevz;


INSERT INTO City (`id`, `status`, `name`) VALUES
(1, 0, 'Maputo'),
(2, 0, 'Beira');

INSERT INTO Member (`id`, `status`, `birthday`, `email`, `facebook`, `gender`, `github`, `imageUrl`, `linkedIn`, `name`, `occupation`, `perferibleFormOfContact`, `phone`, `stackoverflow`, `technologies`, `title`, `twitter`, `username`, `city_id`, `instagram`, `website`) VALUES
(1, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'http://mozdevz.org/wp-content/uploads/2017/03/Guidone.jpg', NULL, 'Guidione Machava', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'UX Master', NULL, 'guidionemachava', 1, NULL, NULL),
(3, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'https://www.linkedin.com/mpr/mpr/AAEAAQAAAAAAAAh8AAAAJGFjNDg1ZGIxLTg0NGItNDZmNi1hYmNiLWM3ZWQyNWNhYmI5YQ.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Not Enginner', NULL, 'rcumbe', 1, NULL, NULL),
(4, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'http://mozdevz.org/wp-content/uploads/2017/03/AlfredoCuanda.png', NULL, 'Alfredo Cuanda', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE, GSON', 'Estrategista da Comunidade', NULL, 'cuanda', 2, NULL, NULL),
(5, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(6, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(7, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'http://mozdevz.org/wp-content/uploads/2017/03/Fei.png', NULL, 'Fei Macheche', 'Trabalhador', NULL, NULL, NULL, 'ANDROID,ROBOTICA,JAVA', 'Google Developer Expert', NULL, 'feimacheche', 1, NULL, NULL),
(8, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(9, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'http://mozdevz.org/wp-content/uploads/2017/03/Omar.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(10, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(11, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(12, 0, NULL, 'dm@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Dario Mungoi', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'dariomungoi', 1, NULL, NULL),
(53, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(57, 0, NULL, 'achaquisse@gmail.com', NULL, 'Masculino', NULL, 'https://fb-s-b-a.akamaihd.net/h-ak-xpa1/v/t1.0-9/11745936_893241937413842_2980154650813117784_n.jpg?oh=6fac5a48d20522891829de457cd7a910&oe=595698F7&__gda__=1499764940_87fcfc300b9aac2796e5218454ca983e', NULL, 'Americo Chaquisse', 'Trabalhador', NULL, NULL, NULL, 'JAVA EE, .NET, C++', 'Full Stack Developer', NULL, 'americochaquisse', 1, NULL, NULL);



INSERT INTO Startup (`id`, `status`, `address`, `coverUrl`, `created_at`, `email`, `imageUrl`, `members_qty`, `name`, `phone`, `rating`, `slogan`, `username`, `website`, `ceo_id`, `description`) VALUES
(1, NULL, 'Av. Paulo Samuel Kankhomba, Nº 1063\n258 Maputo', 'https://scontent-jnb1-1.xx.fbcdn.net/v/t1.0-9/16472989_1825126557756213_5923424127863628055_n.png?oh=b33fe47a2f31b2ef68081356ab012e25&oe=594FA073', '2017-02-24', 'info@mapmoz.co.mz', 'https://fb-s-a-a.akamaihd.net/h-ak-xat1/v/t1.0-1/p200x200/16640774_1824938067775062_325055882355546059_n.jpg?oh=7d769227dfd8b29ad273162cdd4e4cb0&oe=59736329&__gda__=1498430575_2a98a2158d3db9bcf888f82e6937c3a3', '1', 'MapMoz', NULL, 3, 'Junta-te a nós e seja o Herói do teu bairro!', 'mapmoz', 'http://mozdevz.org', 9, 'O projecto MapMoz consiste num mapeamento colaborativo de regiões vulneráveis a decorrer em Moçambique'),
(2, NULL, NULL, 'https://fb-s-a-a.akamaihd.net/h-ak-xat1/v/t1.0-9/13659189_853325598145603_4268797747985372496_n.png?oh=0c40fedc9d6659427ebcd803890175a0&oe=59602F88&__gda__=1499347924_0328462f3fff123475a044eec20ce92b', '2016-07-08', 'info@olataxi.co.mz', 'https://fb-s-d-a.akamaihd.net/h-ak-xpa1/v/t1.0-1/p200x200/12417634_754394891372008_7564816809178156218_n.png?oh=dd7e1d6c6d21a235962416b94ee23ded&oe=5969ECF9&__gda__=1498730789_cc5dd9c1e3e0335c58c59a531d403997', '24', 'Ola Táxi', NULL, 2.5, 'Taxis e Txopelas  de forma Simples e rápida.', 'olataxi', 'http://olataxi.net', 1, 'OlaTaxi é uma aplicação móvel disponível para Android, iOS e WindowsPhone que permite localizar Taxis e Txopelas associados a aplicação de forma Simples e rápida.'),
(3, NULL, NULL, 'https://fb-s-b-a.akamaihd.net/h-ak-xpf1/v/t1.0-9/12644898_936248253089477_3001806065254723476_n.png?oh=57ac1ead229dca8da884384549590d1f&oe=59713EF2&__gda__=1499126043_0e54e3c1978b3667417285a08d2f28e3', '2016-07-18', 'info@moovi.co.mz', 'https://fb-s-c-a.akamaihd.net/h-ak-xaf1/v/t1.0-9/11148717_814945948553042_496339152485657892_n.png?oh=1398bb97c92a06ed2dec4947062e5e93&oe=59729EFA&__gda__=1499155059_2083ab5440c08c877292b6e25fd0cb79', '2', 'Moovi', NULL, 4.5, 'Experimente eventos épicos', 'moovi', 'http://moovimz.com', 12, 'Moovi é um serviço que veio para mudar as idas ao cinema tal como conhecemos! Acreditamos que a experiência de cinema começa muito antes do momento em que se está a frente da tela em qualquer lugar no despertar do desejo em assistir um filme que tanto esperas. Moovi oferece formas cómodas práticas, eficientes que permitem planear, comprar bilhetes e assistir qualquer filme nos cinemas das cidades de Matola e Maputo de forma a economizar ao máximo o seu tempo e esforço.'),
(4, NULL, NULL, 'https://fb-s-d-a.akamaihd.net/h-ak-xpl1/v/t31.0-8/16992308_1844523349147460_5207649445506504377_o.png?oh=2cf639018ad48abea8d74ff4b8a82d52&oe=59648C6E&__gda__=1498547386_13a412825849c573565860de33ef99fe', '2017-07-08', 'info@alltrack.co.mz', 'https://fb-s-d-a.akamaihd.net/h-ak-xpl1/v/t1.0-1/p200x200/17098503_1845013025765159_3332929642481215586_n.jpg?oh=6031fdafca3d968ac296a19d2bd630e7&oe=596154CD&__gda__=1498243439_99e8910777515ae2e2ce0de510823cd8', '3', 'AllTrack', NULL, 2.5, 'O seu carro mais seguro', 'alltrack', 'http://alltrack.co.mz', 57, 'Imagine a possibilidade de saber onde o seu carro está neste exacto momento! Imagine poder desliga-lo agora mesmo. Imagine poder ter informações relativas ao consumo de combustível, quilometragem, saber quando ele ultrapassa certos limites de velocidade, quando ele sai ou entra em sua garragem, ou em outros locais! Imagine tudo isso apartir do seu celular. Incrível, não? \r\nEntão pare de imaginar, isso ja é possível e nós chamamos de allTrack!');

INSERT INTO StartupMember (`id`, `status`, `current`, `role`, `member_id`, `startup_id`) VALUES
(1, NULL, NULL, 'Project Manager', 57, 2),
(2, NULL, NULL, 'CEO', 53, 2);