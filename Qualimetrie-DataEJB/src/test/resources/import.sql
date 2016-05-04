INSERT INTO `super_hero` (`id_super_hero`,`nom`,`prenom`,`super_nom`) VALUES (1,'Parker', 'Peter', 'Spiderman');
INSERT INTO `super_hero` (`id_super_hero`,`nom`,`prenom`,`super_nom`) VALUES (2,'Wayne', 'Bruce', 'Batman');
INSERT INTO `super_hero` (`id_super_hero`,`nom`,`prenom`,`super_nom`) VALUES (3,'Odinson', 'Thor', 'Thor');
INSERT INTO `super_hero` (`id_super_hero`,`nom`,`prenom`,`super_nom`) VALUES (4,'Howlett', 'James', 'Wolverine');

INSERT INTO `costume` (`id_costume`,`couleur`,`is_moulant`,`nom`,`id_super_hero`) VALUES (1, 'noire', false, 'BatCape', 2);
INSERT INTO `costume` (`id_costume`,`couleur`,`is_moulant`,`nom`,`id_super_hero`) VALUES (2, 'rouge', true, 'SpiderCostume', 1);
INSERT INTO `costume` (`id_costume`,`couleur`,`is_moulant`,`nom`,`id_super_hero`) VALUES (3, 'bleu', true, 'XTenue', 4);