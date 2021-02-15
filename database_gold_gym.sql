-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.7.24 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping data for table gold_gym.user: ~18 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `nom`, `pernom`, `number_ins`, `cin`, `phone`, `date_ins`, `prix`, `paiement`, `photo`) VALUES
	(10, 'otmane', 'tahri', 12, 'ID72176', '0671707011', '2021-01-20', '80', 'paiement', 'E:\\xiomi\\106741673_3390581927673817_5548316852354856455_n.jpg'),
	(12, 'fatima', 'tahri', 2, 'id21398', '0600445171', '2021-01-21', '80', 'paiement', 'E:\\ott\\FB_IMG_1554245152255.jpg'),
	(13, 'anas', 'sahel', 23, 'ID32984', '0632154', '2021-01-20', '100', 'paiement', 'E:\\pv\\DSC_9717.JPG'),
	(14, 'imane', 'soukrat', 3, 'ID65942', '062541236', '2021-01-14', '80', 'paiement', 'E:\\tt\\Instagram (1)\\IMG_20170207_163946_803.jpg'),
	(16, 'lamia', 'encg', 124, 'ID23614', '0671245875', '2021-01-23', '100', 'paiement', 'E:\\iphone\\AAAG5691.JPG'),
	(18, 'fdff', 'efefef', 87, 'lùsdpù^z5574', '05645', '2021-01-26', '80', 'pas paiement', 'E:\\tt\\2015-02-12 15.30.52-1.jpg'),
	(19, 'tounssi', 'tahri', 21, 'I56984', '0653073046', '2021-01-24', '80', 'paiement', 'E:\\pv\\DSC_9717.JPG'),
	(20, 'test', 'test', 152, 'sojio', '032154', '2021-01-24', '100', 'paiement', 'E:\\ott\\FB_IMG_1557632803748.jpg'),
	(21, 'lmdkz', 'kdakùd', 83, 'sojio', '032154', '2021-01-10', '100', 'paiement', 'E:\\ott\\IMG_20181224_155216_626.jpg'),
	(22, 'test_1', 'test', 365, 'E853214', '0632125487', '2021-01-24', '80', 'paiement', 'E:\\pv\\DSC_9714.JPG'),
	(23, 'ali', 'kasim', 32, 'ID72176', '26564', '2021-01-24', '100', 'paiement', 'E:\\pv\\2018-09\\ETMY7822.JPG'),
	(26, 'jnnj', 'jnnjk', 546, 'ID72176', '021368145', '2021-01-07', '100', 'paiement', 'E:\\pv\\DSC_9725.JPG'),
	(27, 'rpllp', 'pêpke', 1255, 'lkm', '0213545', '2021-01-09', '80', 'pas paiement', 'E:\\ott\\IMG_20181225_165336_465.jpg'),
	(28, 'ikram ', 'hasnaoui', 154, 'id72154', '06321544455', '2021-01-26', '100', 'pas paiement', 'E:\\xiomi\\IMG-20200108-WA0032.jpg'),
	(29, 'hhjk', 'uyguyf', 125, 'fgugyui', '0656626515565', '2021-01-26', '100', 'pas paiement', 'E:\\ott\\FB_IMG_1565485670794.jpg'),
	(30, 'a(zetryufy', 'ghj;b', 4254, '01454', '42545', '2021-01-26', '100', 'pas paiement', 'E:\\ott\\IMG_20181114_222043_052.jpg');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping data for table gold_gym.user_gold: ~4 rows (approximately)
/*!40000 ALTER TABLE `user_gold` DISABLE KEYS */;
INSERT INTO `user_gold` (`id`, `username`, `password`, `cle`) VALUES
	(1, 'gold_gym', 'goldgym123@', '123654789'),
	(2, 'lmsk', 'mlsks', 'mlskmls'),
	(3, 'lmsflù', 'slmqkspù', '123654789'),
	(4, 'klfmo', 'dkjpjo²', '123654789');
/*!40000 ALTER TABLE `user_gold` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
