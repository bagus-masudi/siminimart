-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 04, 2022 at 06:47 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `siminimart`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `AdminID` int(10) NOT NULL,
  `UserName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AdminID`, `UserName`, `Password`) VALUES
(1, 'Admin', 'admin'),
(2, 'Admin2', 'admin'),
(4, 'Admin3', 'admin'),
(8, 'Admin4', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `databarang`
--

CREATE TABLE `databarang` (
  `kode_barang` int(4) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga` int(10) NOT NULL,
  `stok` int(10) NOT NULL,
  `kategori` varchar(30) NOT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `databarang`
--

INSERT INTO `databarang` (`kode_barang`, `nama_barang`, `harga`, `stok`, `kategori`, `tanggal`) VALUES
(1000, 'Snack Soes Cokelat 80G', 10500, 294, 'Makanan', '2021-12-20'),
(1001, 'Kacang Almond 70G', 17600, 300, 'Makanan', '2021-12-20'),
(1002, 'Bumbu Lada Putih 30G', 4100, 300, 'Makanan', '2021-12-20'),
(1003, 'Santan Kelapa 65Ml', 3000, 250, 'Makanan', '2021-12-20'),
(1004, 'Miegelas Soto Ayam 6x28g', 7500, 200, 'Makanan', '2021-12-20'),
(1005, 'Miegelas Ayam Bawang 6x28g', 7500, 150, 'Makanan', '2021-12-20'),
(1006, 'Milo Serbuk Cokelat 4x22g', 9300, 100, 'Minuman', '2021-12-20'),
(1007, 'Anlene Actifit 3X Coklat 600G', 70000, 99, 'Minuman', '2021-12-20'),
(1008, 'Good Mood Blackcurrant 450Ml', 5700, 200, 'Minuman', '2021-12-20'),
(1009, 'Good Mood Stroberi 450Ml', 5700, 200, 'Minuman', '2021-12-20'),
(1010, 'Minute Maid Juice Guava 300Ml', 5000, 200, 'Minuman', '2021-12-20'),
(1011, 'Buavita Apple 500Ml', 13200, 97, 'Minuman', '2021-12-20'),
(1012, 'Buavita Guava 500Ml', 15200, 97, 'Minuman', '2021-12-20'),
(1014, 'Indomilk Kental Manis Putih 6X37g', 7000, 275, 'Minuman', '2021-12-20'),
(1015, 'My Tea Minuman Teh Oolong 450Ml', 5500, 200, 'Minuman', '2021-12-20'),
(1016, 'Sosro Teh Botol(Kotak) 1L', 10000, 200, 'Minuman', '2021-12-20'),
(1017, 'Frestea Teh Melati 1.5L', 14000, 100, 'Minuman', '2021-12-20'),
(1018, 'Ufo Mi Goreng 88G', 8000, 199, 'Makanan', '2021-12-20'),
(1020, 'Gula Batu 225G', 8500, 149, 'Makanan', '2021-12-20'),
(1021, 'Gula Halus 250G', 7000, 200, 'Makanan', '2021-12-20'),
(1022, 'Garam 500G', 5100, 200, 'Makanan', '2021-12-20'),
(1023, 'Delmonte Fruit Cocktail 825g', 62600, 100, 'Makanan', '2021-12-20'),
(1024, 'Spread Chocolate 160G', 16800, 195, 'Makanan', '2021-12-20'),
(1025, 'Asahi Sardines Saus Tomat 155G', 5900, 299, 'Makanan', '2021-12-20'),
(1026, 'Chocolate Meises 90G', 4500, 300, 'Makanan', '2021-12-20'),
(1027, 'Beras Wangi Super 5Kg', 63800, 100, 'Makanan', '2021-12-20'),
(1028, 'Energen Cokelat 10X34g', 19000, 200, 'Minuman', '2021-12-20'),
(1029, 'Nestle Cereal Koko Krunch 330g', 47500, 150, 'Minuman', '2021-12-20'),
(1030, 'Coconut Water 250Ml', 5900, 300, 'Minuman', '2021-12-20'),
(1101, 'Teh Daun Jawa Oolong Jasmine 50G', 13500, 300, 'Minuman', '2021-12-01'),
(1102, 'Kuaci Susu 80G', 9500, 200, 'Makanan', '2022-01-04');

-- --------------------------------------------------------

--
-- Table structure for table `keranjang`
--

CREATE TABLE `keranjang` (
  `User` varchar(255) NOT NULL,
  `kode_barang` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `Stok` int(11) NOT NULL,
  `harga` int(10) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `total_harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `saldo`
--

CREATE TABLE `saldo` (
  `Nama` varchar(50) NOT NULL,
  `Saldo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `saldo`
--

INSERT INTO `saldo` (`Nama`, `Saldo`) VALUES
('ahmad', 0),
('Ahmad Bagus', 131000),
('Bagus Masudi', 114700),
('Bocor', 23500),
('coba', 0),
('Udin', 12800),
('User', 228900),
('User2', 198500);

-- --------------------------------------------------------

--
-- Table structure for table `topup`
--

CREATE TABLE `topup` (
  `Id_TopUp` int(11) NOT NULL,
  `UserName` varchar(255) NOT NULL,
  `TopUp` int(11) NOT NULL,
  `Total_Harga` int(11) NOT NULL,
  `Tanggal` date NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `topup`
--

INSERT INTO `topup` (`Id_TopUp`, `UserName`, `TopUp`, `Total_Harga`, `Tanggal`, `Status`) VALUES
(3, 'Ahmad Bagus', 50000, 50032, '2021-11-27', 'Sudah Dikonfirmasi'),
(8, 'Ahmad Bagus', 50000, 50737, '2021-11-28', 'Sudah Dikonfirmasi'),
(9, 'Ahmad Bagus', 50000, 2322, '2021-08-21', 'Belum Dikonfirmasi'),
(10, 'Nama', 222, 22, '2021-08-11', 'Belum Dikonfirmasi'),
(11, 'Ahmad Bagus', 50000, 50112, '2022-01-01', 'Belum Dikonfirmasi'),
(12, 'Ahmad Bagus', 50000, 50206, '2022-01-01', 'Belum Dikonfirmasi'),
(13, 'Ahmad Bagus', 50000, 50853, '2022-01-01', 'Belum Dikonfirmasi'),
(14, 'Udin', 50000, 50084, '2022-01-01', 'Sudah Dikonfirmasi'),
(15, 'User', 300000, 300145, '2022-01-04', 'Sudah Dikonfirmasi'),
(16, 'User2', 300000, 300718, '2022-01-04', 'Sudah Dikonfirmasi'),
(17, 'User2', 50000, 50147, '2022-01-04', 'Belum Dikonfirmasi');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kode_barang` int(10) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `total_harga` int(10) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `nama`, `kode_barang`, `nama_barang`, `jumlah`, `total_harga`, `tgl_transaksi`, `status`) VALUES
(4, 'Ahmad Bagus', 1003, 'Santan Kelapa 65Ml', 2, 6000, '2021-11-27', 'Sudah Diambil'),
(5, 'Ahmad Bagus', 1006, 'Milo Serbuk Cokelat 4x22g', 1, 9300, '2021-11-27', 'Sudah Diambil'),
(100, 'Ahmad', 1003, 'Santan Kelapa 85Ml', 3, 9000, '2018-09-20', 'Sudah Diambil'),
(101, 'Bagus Masudi', 1012, 'Buavita Guava 500Ml', 3, 45600, '2021-12-28', 'Sudah Diambil'),
(102, 'Bagus Masudi', 1020, 'Gula Batu 225G', 1, 8500, '2021-12-28', 'Sudah Diambil'),
(103, 'Bagus Masudi', 1000, 'Snack Soes Cokelat 80G', 3, 31200, '2021-12-28', 'Sudah Diambil'),
(104, 'Bocor', 1014, 'Indomilk Kental Manis Putih 6X37g', 25, 175000, '2021-12-28', 'Belum Diambil'),
(105, 'Bocor', 1024, 'Spread Chocolate 160G', 5, 84000, '2021-12-28', 'Sudah Diambil'),
(106, 'Bocor', 1000, 'Snack Soes Cokelat 80G', 1, 10400, '2021-12-28', 'Belum Diambil'),
(107, 'Bocor', 1002, 'Bumbu Lada Putih 30G', 1, 4100, '2021-12-28', 'Sudah Diambil'),
(108, 'Bocor', 1003, 'Santan Kelapa 65Ml', 1, 3000, '2021-12-28', 'Sudah Diambil'),
(109, 'Ahmad Bagus', 1006, 'Milo Serbuk Cokelat 4x22g', 4, 37200, '2022-01-01', 'Belum Diambil'),
(110, 'Udin', 1006, 'Milo Serbuk Cokelat 4x22g', 4, 37200, '2022-01-01', 'Sudah Diambil'),
(111, 'User', 1000, 'Snack Soes Cokelat 80G', 2, 21000, '2022-01-04', 'Belum Diambil'),
(112, 'User', 1011, 'Buavita Apple 500Ml', 3, 39600, '2022-01-04', 'Belum Diambil'),
(113, 'User', 1000, 'Snack Soes Cokelat 80G', 1, 10500, '2022-01-04', 'Belum Diambil'),
(114, 'User2', 1000, 'Snack Soes Cokelat 80G', 2, 21000, '2022-01-04', 'Sudah Diambil'),
(115, 'User2', 1007, 'Anlene Actifit 3X Coklat 600G', 1, 70000, '2022-01-04', 'Sudah Diambil'),
(116, 'User2', 1000, 'Snack Soes Cokelat 80G', 1, 10500, '2022-01-04', 'Belum Diambil');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` int(10) NOT NULL,
  `UserName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `UserName`, `Password`) VALUES
(2, 'Ahmad Bagus', '12345'),
(4, 'Bagus Masudi', '11'),
(8, 'Udin', '12'),
(9, 'User', 'user'),
(14, 'User2', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`AdminID`),
  ADD UNIQUE KEY `UserName` (`UserName`);

--
-- Indexes for table `databarang`
--
ALTER TABLE `databarang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `saldo`
--
ALTER TABLE `saldo`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `topup`
--
ALTER TABLE `topup`
  ADD PRIMARY KEY (`Id_TopUp`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `UserName` (`UserName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `AdminID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `databarang`
--
ALTER TABLE `databarang`
  MODIFY `kode_barang` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100004;

--
-- AUTO_INCREMENT for table `topup`
--
ALTER TABLE `topup`
  MODIFY `Id_TopUp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=117;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UserID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
