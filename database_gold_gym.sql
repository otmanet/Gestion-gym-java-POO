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

-- Dumping data for table book_laravel.books: ~6 rows (approximately)
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` (`id`, `user_id`, `name`, `auteur`, `numero`, `created_at`, `updated_at`, `deleted_at`) VALUES
	(1, 1, 'fgfgf', 'fgfgfgf', '123', NULL, NULL, NULL),
	(2, 2, 'sddsds', 'xxxxxxxxxxxx', '123', NULL, NULL, NULL),
	(3, 3, 'bfgf', 'fgfg', 'gfgfg', NULL, NULL, NULL),
	(4, 1, 'otmane', 'khalil', '125', NULL, NULL, NULL),
	(5, 1, 'jkhkhk', 'ggu', '15', NULL, NULL, NULL),
	(6, 1, 'nkhil', 'gkjhl', 'gkjghol', NULL, NULL, NULL);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;

-- Dumping data for table book_laravel.failed_jobs: ~0 rows (approximately)
/*!40000 ALTER TABLE `failed_jobs` DISABLE KEYS */;
/*!40000 ALTER TABLE `failed_jobs` ENABLE KEYS */;

-- Dumping data for table book_laravel.migrations: ~5 rows (approximately)
/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;
INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
	(1, '2014_10_12_000000_create_users_table', 1),
	(2, '2014_10_12_100000_create_password_resets_table', 1),
	(3, '2019_08_19_000000_create_failed_jobs_table', 1),
	(4, '2020_10_07_173055_c_r_e_a_t_e__t_a_b_l_e__b_o_o_k_s', 1),
	(5, '2020_10_14_223707_add_culomn_delete', 1);
/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;

-- Dumping data for table book_laravel.password_resets: ~0 rows (approximately)
/*!40000 ALTER TABLE `password_resets` DISABLE KEYS */;
INSERT INTO `password_resets` (`email`, `token`, `created_at`) VALUES
	('otmanetahri1@gmail.com', '$2y$10$1j4YoKPR4MJwVuN8HI6tcO5q4vTAmMI1/6S.ELz.9h8JTUIEvr2UW', '2020-11-13 22:15:55');
/*!40000 ALTER TABLE `password_resets` ENABLE KEYS */;

-- Dumping data for table book_laravel.users: ~2 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `name`, `email`, `email_verified_at`, `password`, `remember_token`, `created_at`, `updated_at`) VALUES
	(1, 'otmane', 'otmanetahri1@gmail.com', NULL, '$2y$10$Za6X51jYgcQ6RpINd6zzAeLy0UXViyje/sdiCFF0jo7AO70srej72', NULL, '2020-10-15 22:50:07', '2020-10-15 22:50:07'),
	(2, 'fatima', 'fatima1@gmail.com', NULL, '$2y$10$VluK0tA3zuOXlY4PUjr2gu16pEcZOtaMI9Okk22y0Y03d7jKFrAAe', NULL, '2020-10-15 22:59:04', '2020-10-15 22:59:04'),
	(3, 'otmane', 'jjjjj@gmail.com', NULL, '$2y$10$59PCsNQWRrQsE.OaRh6NwuXgrmVRAXH01blvj6LwDbc2vWSbM1b2a', NULL, '2020-11-13 22:17:28', '2020-11-13 22:17:28');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping data for table datarecipes.failed_jobs: ~0 rows (approximately)
/*!40000 ALTER TABLE `failed_jobs` DISABLE KEYS */;
/*!40000 ALTER TABLE `failed_jobs` ENABLE KEYS */;

-- Dumping data for table datarecipes.image_recipes: ~8 rows (approximately)
/*!40000 ALTER TABLE `image_recipes` DISABLE KEYS */;
INSERT INTO `image_recipes` (`id`, `photo`, `recipe_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
	(1, '106987497_1206723666341659_8861959918252743692_n.jpg', 1, '2020-09-24 17:31:15', '2020-10-24 00:37:37', '2020-10-24 00:37:37'),
	(2, '3.jpg', 2, '2020-10-27 22:54:52', '2020-10-27 22:54:52', NULL),
	(3, '4.jpg', 2, '2020-10-27 22:54:52', '2020-10-27 22:54:52', NULL),
	(4, 'CNI 1.jpg', 2, '2020-10-27 22:54:52', '2020-10-27 22:54:52', NULL),
	(5, 'AEBC3453.JPG', 4, '2021-02-01 08:56:18', '2021-02-01 08:57:29', '2021-02-01 08:57:29'),
	(6, 'AIMF4735.JPG', 4, '2021-02-01 08:56:18', '2021-02-01 08:56:18', NULL),
	(7, 'ALQH3740.JPG', 4, '2021-02-01 08:56:18', '2021-02-01 08:56:18', NULL),
	(8, 'ARVM3496.JPG', 5, '2021-02-01 09:05:31', '2021-02-07 23:41:07', '2021-02-07 23:41:07'),
	(9, 'CFAO8026.JPG', 5, '2021-02-01 09:05:31', '2021-02-07 23:41:07', '2021-02-07 23:41:07'),
	(10, '126823353_1092155891244886_2249522340026674114_n.jpg', 6, '2021-02-06 14:30:32', '2021-02-06 14:30:32', NULL);
/*!40000 ALTER TABLE `image_recipes` ENABLE KEYS */;

-- Dumping data for table datarecipes.ingredients: ~8 rows (approximately)
/*!40000 ALTER TABLE `ingredients` DISABLE KEYS */;
INSERT INTO `ingredients` (`id`, `desc_integeredient`, `recipe_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
	(1, 'ezze', 1, '2020-09-24 17:31:21', '2020-10-24 00:37:37', '2020-10-24 00:37:37'),
	(2, 'rerrre', 1, '2020-09-24 17:31:21', '2020-10-24 00:37:37', '2020-10-24 00:37:37'),
	(3, 'dsqdsq', 2, '2020-10-27 22:55:00', '2020-10-27 22:55:00', NULL),
	(4, 'sdsdsd', 2, '2020-10-27 22:55:00', '2020-10-27 22:55:00', NULL),
	(5, 'sldlm,n', 4, '2021-02-01 08:56:34', '2021-02-01 08:56:34', NULL),
	(6, 's,ldsmdlms', 4, '2021-02-01 08:56:34', '2021-02-01 08:56:34', NULL),
	(7, 'lsm;d,ld', 4, '2021-02-01 08:56:34', '2021-02-01 08:56:34', NULL),
	(8, 'ldlkùf', 5, '2021-02-01 09:06:13', '2021-02-07 23:41:07', '2021-02-07 23:41:07'),
	(9, 'ekfùfùefp', 5, '2021-02-01 09:06:13', '2021-02-07 23:41:07', '2021-02-07 23:41:07'),
	(10, 'lsfmlg^fsg', 5, '2021-02-01 09:06:13', '2021-02-07 23:41:07', '2021-02-07 23:41:07'),
	(11, 'swfszq', 6, '2021-02-06 14:30:39', '2021-02-06 14:30:39', NULL),
	(12, 'fssfd', 6, '2021-02-06 14:30:39', '2021-02-06 14:30:39', NULL);
/*!40000 ALTER TABLE `ingredients` ENABLE KEYS */;

-- Dumping data for table datarecipes.migrations: ~11 rows (approximately)
/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;
INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
	(1, '2014_10_12_000000_create_users_table', 1),
	(2, '2019_08_19_000000_create_failed_jobs_table', 1),
	(3, '2019_12_14_000001_create_personal_access_tokens_table', 1),
	(4, '2020_05_10_151549_create_table_recipe', 1),
	(5, '2020_05_10_152258_create_table_image_recipe', 1),
	(6, '2020_05_12_015322_create_delete', 1),
	(7, '2020_05_26_155022_create_delete_image', 1),
	(8, '2020_06_09_235811_crete_type_recipe', 1),
	(9, '2020_06_10_235753_create_table_ingredients', 1),
	(10, '2020_06_18_010447_create_delete_ingredients', 1),
	(11, '2020_07_21_002311_create_table_steps', 1),
	(12, '2014_10_12_100000_create_password_resets_table', 2);
/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;

-- Dumping data for table datarecipes.password_resets: ~1 rows (approximately)
/*!40000 ALTER TABLE `password_resets` DISABLE KEYS */;
INSERT INTO `password_resets` (`email`, `token`, `created_at`) VALUES
	('otmanetahri1@gmail.com', '$2y$10$LvQIFtM/UybO9NDDGdJKje.FEqfMdKOruGtHQYJ9Pz46cEdzqPKbO', '2021-03-02 23:56:47');
/*!40000 ALTER TABLE `password_resets` ENABLE KEYS */;

-- Dumping data for table datarecipes.personal_access_tokens: ~0 rows (approximately)
/*!40000 ALTER TABLE `personal_access_tokens` DISABLE KEYS */;
/*!40000 ALTER TABLE `personal_access_tokens` ENABLE KEYS */;

-- Dumping data for table datarecipes.recipes: ~5 rows (approximately)
/*!40000 ALTER TABLE `recipes` DISABLE KEYS */;
INSERT INTO `recipes` (`id`, `recipe_name`, `recipe_description`, `created_at`, `updated_at`, `deleted_at`, `type_recipes`) VALUES
	(1, 'fddr', 'trftrtr', '2020-09-24 17:31:08', '2020-09-24 17:31:08', '2020-10-24 00:37:37', 'وصفات دايت'),
	(2, 'ستنمنتشسنم نمتسنميت', 'هشيسيهششتي تيهحستحخ كمسشنيكم', NULL, NULL, NULL, 'صوص'),
	(3, 'gjhjh', 'hkjvkvk', '2020-11-27 20:44:06', '2020-11-27 20:44:06', NULL, 'صوص'),
	(4, 'dlkck', 'skq^pskp', NULL, NULL, NULL, 'وصفات نباتية'),
	(5, 'lmkqf,ùm', 'f;qùkmzmùf', NULL, NULL, '2021-02-07 23:41:07', 'وصفات نباتية'),
	(6, 'jhkh', 'fgbxg', NULL, NULL, NULL, 'معجنات');
/*!40000 ALTER TABLE `recipes` ENABLE KEYS */;

-- Dumping data for table datarecipes.steps: ~8 rows (approximately)
/*!40000 ALTER TABLE `steps` DISABLE KEYS */;
INSERT INTO `steps` (`id`, `desc_steps`, `recipe_id`, `deleted_at`, `created_at`, `updated_at`) VALUES
	(1, 'rztgrqgrgr', 1, '2020-10-24 00:37:37', '2020-09-24 17:31:28', '2020-10-24 00:37:37'),
	(2, 'nnnnnnnnnnnnnnbbbbbbbbbbbbbbbb', 1, '2020-10-24 00:35:12', '2020-09-24 17:31:28', '2020-10-24 00:37:37'),
	(3, 'sdsds', 2, NULL, '2020-10-27 22:55:08', '2020-10-27 22:55:08'),
	(4, 'dsdqsd', 2, NULL, '2020-10-27 22:55:08', '2020-10-27 22:55:08'),
	(5, 'sml,,ldm,ùld', 4, NULL, '2021-02-01 08:56:53', '2021-02-01 08:56:53'),
	(6, 'm,sdlùùls', 4, NULL, '2021-02-01 08:56:53', '2021-02-01 08:56:53'),
	(7, ';ldfldùqmkms', 4, NULL, '2021-02-01 08:56:53', '2021-02-01 08:56:53'),
	(8, ';fsm;fm;mù', 5, '2021-02-07 23:41:07', '2021-02-01 09:07:56', '2021-02-07 23:41:07'),
	(9, ';ldvùvùmdvmù', 5, '2021-02-07 23:41:07', '2021-02-01 09:07:56', '2021-02-07 23:41:07'),
	(10, 'kfp^vkp^fp^kf', 5, '2021-02-07 23:41:07', '2021-02-01 09:07:56', '2021-02-07 23:41:07'),
	(11, 'cbxgbv', 6, NULL, '2021-02-06 14:30:44', '2021-02-06 14:30:44');
/*!40000 ALTER TABLE `steps` ENABLE KEYS */;

-- Dumping data for table datarecipes.users: ~0 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `name`, `email`, `email_verified_at`, `password`, `remember_token`, `created_at`, `updated_at`) VALUES
	(1, 'otmane', 'otmanetahri1@gmail.com', NULL, '$2y$10$1jZSo8DHs0Kc8w9a7WWjn.US68DFWsWzJObpeaPdO3UCHUnyBP2cm', 'ereib5jOkUMDzXfuWiFci938C6Qy7amDPt4toMcPPge8ntw6p96jjsmqMNEK', '2021-02-12 14:21:13', '2021-02-12 14:21:13'),
	(2, 'fatima', 'fatima1@gmail.com', NULL, '$2y$10$1SXiGFp2iCIj880NFHsyROHqkXrzOHUKA3qskQnky35yOIjNbtteO', 'YDPJIIzhXfAd4536X7MEzbaP8X3asadBMDv39IuiSU9VnaeGc2lbzDqyBf4G', '2021-03-03 00:32:23', '2021-03-03 00:32:23');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

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
