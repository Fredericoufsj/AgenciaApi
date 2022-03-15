INSERT INTO tb_cliente(email, nome) VALUES ('maria@gmail.com', 'maria');
INSERT INTO tb_cliente(email, nome) VALUES ('joao@gmail.com', 'joao');
INSERT INTO tb_cliente(email, nome) VALUES ('ana@gmail.com', 'ana');
INSERT INTO tb_cliente(email, nome) VALUES ('lucia@gmail.com', 'lucia');
INSERT INTO tb_cliente(email, nome) VALUES ('joaquim@gmail.com', 'joaquim');

INSERT INTO tb_passagem(preco, destino, imagem) VALUES (840.3, 'Cancun', 'https://cdn.getyourguide.com/img/location/5b45f52823afc.jpeg/68.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (224.6, 'Rio de Janeiro', 'https://todepassagem.clickbus.com.br/wp-content/uploads/2020/03/Cristo-Redentor-RJ.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (484.0, 'Madri', 'https://www.maxmilhas.com.br/blog/wp-content/uploads/2019/06/293795-7-dicas-sobre-madri-para-quem-vai-pela-primeira-vez-770x450.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (556.0, 'Porto', 'https://www.flytap.com/-/media/Flytap/new-tap-pages/destinations/europe/portugal/porto/destinations-portugal-porto-banner-mobile-1024x553.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (343.0, 'Minas Gerais', 'https://www.minasgerais.com.br/imagens/destinos/1578315263xjVvRVGS33.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (908.5, 'Paris', 'https://cdn.getyourguide.com/img/location/5ffeb39946966.jpeg/88.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (234.5, 'Amsterdã', 'https://www.melhoresdestinos.com.br/wp-content/uploads/2019/02/passagens-aereas-amsterda-capa2019-03.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (546.7, 'Lima', 'https://www.latamairlines.com/content/dam/latamxp/sites/destinos/peru/hero/LIM.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (227.7, 'Montreal', 'https://p5m2q7z5.stackpathcdn.com/wp-content/uploads/2015/12/montreal-canada.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (184.0, 'Veneza', 'https://viagemeturismo.abril.com.br/wp-content/uploads/2016/12/153827183.jpeg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (344.9, 'Machu Picchu', 'https://blog.livareviagens.com.br/wp-content/uploads/2020/10/machu-picchu-e-a-cidade-perdida-dos-incas-opt-1200x900.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (669.9, 'Córdoba', 'https://www.melhoresdestinos.com.br/wp-content/uploads/2019/04/cordoba-argentina-capa2019.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (334.9, 'Buenos Aires', 'https://www.daninoce.com.br/wp-content/uploads/2018/01/o-que-voce-precisa-saber-antes-de-ir-a-buenos-aires-dani-noce-imagem-destaque-960x625.jpg');
INSERT INTO tb_passagem(preco, destino, imagem) VALUES (178.5, 'Brasilia', 'https://www.euandopelomundo.com/wp-content/uploads/2015/07/brasilia.jpg');

INSERT INTO tb_compra(passagem_id, cliente_id, quantidade) VALUES (1, 1, 1);
INSERT INTO tb_compra(passagem_id, cliente_id, quantidade) VALUES (5, 5, 1);
INSERT INTO tb_compra(passagem_id, cliente_id, quantidade) VALUES (10, 2, 1);
INSERT INTO tb_compra(passagem_id, cliente_id, quantidade) VALUES (13, 3, 1);

