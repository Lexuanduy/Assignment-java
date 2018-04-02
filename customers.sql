-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2018 at 06:53 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 5.6.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankinformation`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `soTaiKhoan` int(50) NOT NULL,
  `tenTaiKhoan` varchar(100) CHARACTER SET utf8 NOT NULL,
  `matKhau` varchar(50) CHARACTER SET utf8 NOT NULL,
  `soDu` int(60) NOT NULL DEFAULT '0',
  `ngayTao` varchar(50) NOT NULL,
  `trangThai` int(10) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`soTaiKhoan`, `tenTaiKhoan`, `matKhau`, `soDu`, `ngayTao`, `trangThai`) VALUES
(2, 'duy', '3842748', 12000000, '0', 1),
(3, 'phuoc', '378293', 1000000, '0', 1),
(5, 'ba', '389273', 2300000, '0', 1),
(6, 'nhat', '3382728', 10000000, '0', 1),
(8, 'duyle', '1234567', 0, '1522326751155', 1),
(9, 'james', '1234567', 0, '1522327532979', 1),
(10, 'dinh', '1234567', 0, 'Mar 29,2018 19:54', 1),
(11, 'lexuanduy', '12345678', 0, 'Mar 29,2018 20:04', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`soTaiKhoan`),
  ADD UNIQUE KEY `index_ten` (`tenTaiKhoan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `soTaiKhoan` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
