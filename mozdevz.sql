-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2017 at 04:56 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mozdevz`
--

-- --------------------------------------------------------

--
-- Table structure for table `city`
--

CREATE TABLE `city` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `city`
--

INSERT INTO `city` (`id`, `status`, `name`) VALUES
(1, 0, 'Maputo'),
(2, 0, 'Beira');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `facebook` varchar(255) DEFAULT NULL,
  `gender` varchar(255) NOT NULL,
  `github` varchar(255) DEFAULT NULL,
  `imageUrl` varchar(255) NOT NULL,
  `linkedIn` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `occupation` varchar(255) DEFAULT NULL,
  `perferibleFormOfContact` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `stackoverflow` varchar(255) DEFAULT NULL,
  `technologies` varchar(255) DEFAULT NULL,
  `title` varchar(255) NOT NULL,
  `twitter` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `city_id` bigint(20) NOT NULL,
  `instagram` varchar(255) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `status`, `birthday`, `email`, `facebook`, `gender`, `github`, `imageUrl`, `linkedIn`, `name`, `occupation`, `perferibleFormOfContact`, `phone`, `stackoverflow`, `technologies`, `title`, `twitter`, `username`, `city_id`, `instagram`, `website`) VALUES
(1, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'http://mozdevz.org/wp-content/uploads/2017/03/Guidone.jpg', NULL, 'Guidione Machava', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'UX Master', NULL, 'guidionemachava', 1, NULL, NULL),
(2, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Feminino', 'https://github.com/Romildo-Cumbe', 'webroot/assets/images/demo/users/face1.jpg', NULL, 'Carlos Cossa', 'Estudante', NULL, NULL, NULL, '', 'UX + UI Architect', NULL, 'carloscumbe', 2, NULL, 'http://web.co.mz'),
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
(13, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(14, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(15, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(16, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(17, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(18, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(19, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(20, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(21, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(22, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(23, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(24, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(25, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(26, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(27, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(28, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(29, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(30, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(31, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(32, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(33, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(34, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(35, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(36, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(37, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(38, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(39, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(40, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(41, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(42, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(43, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(44, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(45, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(46, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(47, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(48, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(49, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(50, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(51, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(52, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(53, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(54, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(55, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(56, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(57, 0, NULL, 'achaquisse@gmail.com', NULL, 'Masculino', NULL, 'https://fb-s-b-a.akamaihd.net/h-ak-xpa1/v/t1.0-9/11745936_893241937413842_2980154650813117784_n.jpg?oh=6fac5a48d20522891829de457cd7a910&oe=595698F7&__gda__=1499764940_87fcfc300b9aac2796e5218454ca983e', NULL, 'Americo Chaquisse', 'Trabalhador', NULL, NULL, NULL, 'JAVA EE, .NET, C++', 'Full Stack Developer', NULL, 'americochaquisse', 1, NULL, NULL),
(58, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(59, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(60, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(61, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(62, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(63, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(64, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(65, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(66, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(67, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(68, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL),
(69, 0, NULL, 'romildocumbe@gmail.com', NULL, 'Masculino', NULL, 'webroot/assets/images/demo/users/face11.jpg', NULL, 'Romildo Cumbe', 'Trabalhador', NULL, NULL, NULL, 'PHP,JAVA,JAVA EE', 'Full Stack Java Web Developer', NULL, 'romildocumbe', 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `membereducation`
--

CREATE TABLE `membereducation` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `course` varchar(255) DEFAULT NULL,
  `current` bit(1) DEFAULT NULL,
  `finished` bit(1) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `phase` varchar(255) DEFAULT NULL,
  `member_id` bigint(20) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `memberproject`
--

CREATE TABLE `memberproject` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `current` bit(1) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `since` varchar(255) DEFAULT NULL,
  `until` varchar(255) DEFAULT NULL,
  `member_id` bigint(20) DEFAULT NULL,
  `project_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `imageURL` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `school`
--

CREATE TABLE `school` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `shortcode` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `startup`
--

CREATE TABLE `startup` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `coverUrl` varchar(255) DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `imageUrl` varchar(255) NOT NULL,
  `members_qty` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `rating` double NOT NULL,
  `slogan` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `website` varchar(255) DEFAULT NULL,
  `ceo_id` bigint(20) DEFAULT NULL,
  `description` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `startup`
--

INSERT INTO `startup` (`id`, `status`, `address`, `coverUrl`, `created_at`, `email`, `imageUrl`, `members_qty`, `name`, `phone`, `rating`, `slogan`, `username`, `website`, `ceo_id`, `description`) VALUES
(1, NULL, 'Av. Paulo Samuel Kankhomba, Nº 1063\n258 Maputo', 'https://scontent-jnb1-1.xx.fbcdn.net/v/t1.0-9/16472989_1825126557756213_5923424127863628055_n.png?oh=b33fe47a2f31b2ef68081356ab012e25&oe=594FA073', '2017-02-24', 'info@mapmoz.co.mz', 'https://fb-s-a-a.akamaihd.net/h-ak-xat1/v/t1.0-1/p200x200/16640774_1824938067775062_325055882355546059_n.jpg?oh=7d769227dfd8b29ad273162cdd4e4cb0&oe=59736329&__gda__=1498430575_2a98a2158d3db9bcf888f82e6937c3a3', '1', 'MapMoz', NULL, 3, 'Junta-te a nós e seja o Herói do teu bairro!', 'mapmoz', 'http://mozdevz.org', 9, 'O projecto MapMoz consiste num mapeamento colaborativo de regiões vulneráveis a decorrer em Moçambique'),
(2, NULL, NULL, 'https://fb-s-a-a.akamaihd.net/h-ak-xat1/v/t1.0-9/13659189_853325598145603_4268797747985372496_n.png?oh=0c40fedc9d6659427ebcd803890175a0&oe=59602F88&__gda__=1499347924_0328462f3fff123475a044eec20ce92b', '2016-07-08', 'info@olataxi.co.mz', 'https://fb-s-d-a.akamaihd.net/h-ak-xpa1/v/t1.0-1/p200x200/12417634_754394891372008_7564816809178156218_n.png?oh=dd7e1d6c6d21a235962416b94ee23ded&oe=5969ECF9&__gda__=1498730789_cc5dd9c1e3e0335c58c59a531d403997', '24', 'Ola Táxi', NULL, 2.5, 'Taxis e Txopelas  de forma Simples e rápida.', 'olataxi', 'http://olataxi.net', 1, 'OlaTaxi é uma aplicação móvel disponível para Android, iOS e WindowsPhone que permite localizar Taxis e Txopelas associados a aplicação de forma Simples e rápida.'),
(3, NULL, NULL, 'https://fb-s-b-a.akamaihd.net/h-ak-xpf1/v/t1.0-9/12644898_936248253089477_3001806065254723476_n.png?oh=57ac1ead229dca8da884384549590d1f&oe=59713EF2&__gda__=1499126043_0e54e3c1978b3667417285a08d2f28e3', '2016-07-18', 'info@moovi.co.mz', 'https://fb-s-c-a.akamaihd.net/h-ak-xaf1/v/t1.0-9/11148717_814945948553042_496339152485657892_n.png?oh=1398bb97c92a06ed2dec4947062e5e93&oe=59729EFA&__gda__=1499155059_2083ab5440c08c877292b6e25fd0cb79', '2', 'Moovi', NULL, 4.5, 'Experimente eventos épicos', 'moovi', 'http://moovimz.com', 12, 'Moovi é um serviço que veio para mudar as idas ao cinema tal como conhecemos! Acreditamos que a experiência de cinema começa muito antes do momento em que se está a frente da tela em qualquer lugar no despertar do desejo em assistir um filme que tanto esperas. Moovi oferece formas cómodas práticas, eficientes que permitem planear, comprar bilhetes e assistir qualquer filme nos cinemas das cidades de Matola e Maputo de forma a economizar ao máximo o seu tempo e esforço.'),
(4, NULL, NULL, 'https://fb-s-d-a.akamaihd.net/h-ak-xpl1/v/t31.0-8/16992308_1844523349147460_5207649445506504377_o.png?oh=2cf639018ad48abea8d74ff4b8a82d52&oe=59648C6E&__gda__=1498547386_13a412825849c573565860de33ef99fe', '2017-07-08', 'info@alltrack.co.mz', 'https://fb-s-d-a.akamaihd.net/h-ak-xpl1/v/t1.0-1/p200x200/17098503_1845013025765159_3332929642481215586_n.jpg?oh=6031fdafca3d968ac296a19d2bd630e7&oe=596154CD&__gda__=1498243439_99e8910777515ae2e2ce0de510823cd8', '3', 'AllTrack', NULL, 2.5, 'O seu carro mais seguro', 'alltrack', 'http://alltrack.co.mz', 57, 'Imagine a possibilidade de saber onde o seu carro está neste exacto momento! Imagine poder desliga-lo agora mesmo. Imagine poder ter informações relativas ao consumo de combustível, quilometragem, saber quando ele ultrapassa certos limites de velocidade, quando ele sai ou entra em sua garragem, ou em outros locais! Imagine tudo isso apartir do seu celular. Incrível, não? \r\nEntão pare de imaginar, isso ja é possível e nós chamamos de allTrack!');

-- --------------------------------------------------------

--
-- Table structure for table `startupmember`
--

CREATE TABLE `startupmember` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `current` bit(1) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `member_id` bigint(20) DEFAULT NULL,
  `startup_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `startupmember`
--

INSERT INTO `startupmember` (`id`, `status`, `current`, `role`, `member_id`, `startup_id`) VALUES
(1, NULL, NULL, 'Project Manager', 57, 2),
(2, NULL, NULL, 'CEO', 53, 2);

-- --------------------------------------------------------

--
-- Table structure for table `startuppartner`
--

CREATE TABLE `startuppartner` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `current` bit(1) DEFAULT NULL,
  `field` varchar(255) NOT NULL,
  `since` datetime DEFAULT NULL,
  `until` datetime DEFAULT NULL,
  `partner_id` bigint(20) DEFAULT NULL,
  `startup_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `isGuest` bit(1) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `member_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `city`
--
ALTER TABLE `city`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKcbqlh13ks7kn0bxm6ut9vlqj8` (`city_id`);

--
-- Indexes for table `membereducation`
--
ALTER TABLE `membereducation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKs07y5mu6ry9q5dqdwhuc483et` (`member_id`),
  ADD KEY `FKkdx1d8rrkaidfibjgoddb9ju7` (`school_id`);

--
-- Indexes for table `memberproject`
--
ALTER TABLE `memberproject`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfoa2a61gb7sila08pn8byp248` (`member_id`),
  ADD KEY `FKnvvmhftcax8c6gvjuvvf5q772` (`project_id`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `school`
--
ALTER TABLE `school`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `startup`
--
ALTER TABLE `startup`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKaq4g3rn8qr9ej34gfc1xjumr6` (`ceo_id`);

--
-- Indexes for table `startupmember`
--
ALTER TABLE `startupmember`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6ix1dt4y96ousotybcy3ojxq8` (`member_id`),
  ADD KEY `FK76a9wau8jyq6brcjwb2ggkqnd` (`startup_id`);

--
-- Indexes for table `startuppartner`
--
ALTER TABLE `startuppartner`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK22xqh14w4r4lvjqyfjpekfjuk` (`partner_id`),
  ADD KEY `FKj99elcktt1iiyqldsvswnaf7y` (`startup_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlwiqp357mkjcxwhbd1hax9iuk` (`member_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `city`
--
ALTER TABLE `city`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;
--
-- AUTO_INCREMENT for table `membereducation`
--
ALTER TABLE `membereducation`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `memberproject`
--
ALTER TABLE `memberproject`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `school`
--
ALTER TABLE `school`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `startup`
--
ALTER TABLE `startup`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `startupmember`
--
ALTER TABLE `startupmember`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `startuppartner`
--
ALTER TABLE `startuppartner`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `member`
--
ALTER TABLE `member`
  ADD CONSTRAINT `FKcbqlh13ks7kn0bxm6ut9vlqj8` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`);

--
-- Constraints for table `membereducation`
--
ALTER TABLE `membereducation`
  ADD CONSTRAINT `FKkdx1d8rrkaidfibjgoddb9ju7` FOREIGN KEY (`school_id`) REFERENCES `school` (`id`),
  ADD CONSTRAINT `FKs07y5mu6ry9q5dqdwhuc483et` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`);

--
-- Constraints for table `memberproject`
--
ALTER TABLE `memberproject`
  ADD CONSTRAINT `FKfoa2a61gb7sila08pn8byp248` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`),
  ADD CONSTRAINT `FKnvvmhftcax8c6gvjuvvf5q772` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`);

--
-- Constraints for table `startup`
--
ALTER TABLE `startup`
  ADD CONSTRAINT `FKaq4g3rn8qr9ej34gfc1xjumr6` FOREIGN KEY (`ceo_id`) REFERENCES `member` (`id`);

--
-- Constraints for table `startupmember`
--
ALTER TABLE `startupmember`
  ADD CONSTRAINT `FK6ix1dt4y96ousotybcy3ojxq8` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`),
  ADD CONSTRAINT `FK76a9wau8jyq6brcjwb2ggkqnd` FOREIGN KEY (`startup_id`) REFERENCES `startup` (`id`);

--
-- Constraints for table `startuppartner`
--
ALTER TABLE `startuppartner`
  ADD CONSTRAINT `FK22xqh14w4r4lvjqyfjpekfjuk` FOREIGN KEY (`partner_id`) REFERENCES `startup` (`id`),
  ADD CONSTRAINT `FKj99elcktt1iiyqldsvswnaf7y` FOREIGN KEY (`startup_id`) REFERENCES `startup` (`id`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FKlwiqp357mkjcxwhbd1hax9iuk` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
