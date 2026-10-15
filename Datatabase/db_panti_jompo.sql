-- phpMyAdmin SQL Dump
-- version 5.2.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 15, 2026 at 06:20 AM
-- Server version: 8.4.3
-- PHP Version: 8.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_panti_jompo`
--

-- --------------------------------------------------------

--
-- Table structure for table `kunjungan_keluarga`
--

CREATE TABLE `kunjungan_keluarga` (
  `id_kunjungan` int NOT NULL,
  `id_penghuni` int NOT NULL,
  `nama_pengunjung` varchar(100) NOT NULL,
  `hari` enum('Senin','Selasa','Rabu','Kamis','Jumat','Sabtu','Minggu') NOT NULL,
  `jam` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kunjungan_keluarga`
--

INSERT INTO `kunjungan_keluarga` (`id_kunjungan`, `id_penghuni`, `nama_pengunjung`, `hari`, `jam`) VALUES
(1, 1, 'Andi Pratama', 'Sabtu', '10:00:00'),
(2, 2, 'Rina Wulandari', 'Minggu', '14:30:00'),
(3, 1, 'Sisi', 'Senin', '12:00:00'),
(4, 1, 'Vina', 'Minggu', '15:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `penghuni_intensif`
--

CREATE TABLE `penghuni_intensif` (
  `id_penghuni` int NOT NULL,
  `nama_perawat` varchar(100) NOT NULL,
  `kontrol_medis` varchar(100) NOT NULL,
  `jadwal_obat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `penghuni_intensif`
--

INSERT INTO `penghuni_intensif` (`id_penghuni`, `nama_perawat`, `kontrol_medis`, `jadwal_obat`) VALUES
(2, 'Ners Dewi', 'Senin dan Kamis', 'Setiap pukul 08:00 dan 20:00'),
(3, 'Ivan', 'Kamis & Sabtu', '3x Sehari Setelah Makan');

-- --------------------------------------------------------

--
-- Table structure for table `penghuni_mandiri`
--

CREATE TABLE `penghuni_mandiri` (
  `id_penghuni` int NOT NULL,
  `hobi` varchar(100) NOT NULL,
  `kegiatan_harian` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `penghuni_mandiri`
--

INSERT INTO `penghuni_mandiri` (`id_penghuni`, `hobi`, `kegiatan_harian`) VALUES
(1, 'Merajut', 'Senam pagi dan membaca'),
(4, 'Merajut', 'Senam Pagi');

-- --------------------------------------------------------

--
-- Table structure for table `penghuni_panti`
--

CREATE TABLE `penghuni_panti` (
  `id_penghuni` int NOT NULL,
  `nama` varchar(100) NOT NULL,
  `usia` int NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `kondisi` varchar(100) NOT NULL,
  `kategori` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `penghuni_panti`
--

INSERT INTO `penghuni_panti` (`id_penghuni`, `nama`, `usia`, `no_telp`, `jenis_kelamin`, `kondisi`, `kategori`) VALUES
(1, 'Siti Aminah', 72, '081234567890', 'Perempuan', 'Hipertensi ringan', 'Penghuni Mandiri'),
(2, 'Budi Santoso', 80, '081298765432', 'Laki Laki', 'Stroke pasca serangan', 'Penghuni Intensif'),
(3, 'Agus Purnomo', 80, '083142536475', 'Laki Laki', 'Stroke', 'Penghuni Intensif'),
(4, 'Komaroh', 76, '082132435465', 'Perempuan', 'Sehat', 'Penghuni Mandiri');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kunjungan_keluarga`
--
ALTER TABLE `kunjungan_keluarga`
  ADD PRIMARY KEY (`id_kunjungan`),
  ADD KEY `id_penghuni` (`id_penghuni`);

--
-- Indexes for table `penghuni_intensif`
--
ALTER TABLE `penghuni_intensif`
  ADD PRIMARY KEY (`id_penghuni`);

--
-- Indexes for table `penghuni_mandiri`
--
ALTER TABLE `penghuni_mandiri`
  ADD PRIMARY KEY (`id_penghuni`);

--
-- Indexes for table `penghuni_panti`
--
ALTER TABLE `penghuni_panti`
  ADD PRIMARY KEY (`id_penghuni`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kunjungan_keluarga`
--
ALTER TABLE `kunjungan_keluarga`
  MODIFY `id_kunjungan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kunjungan_keluarga`
--
ALTER TABLE `kunjungan_keluarga`
  ADD CONSTRAINT `kunjungan_keluarga_ibfk_1` FOREIGN KEY (`id_penghuni`) REFERENCES `penghuni_panti` (`id_penghuni`) ON DELETE CASCADE;

--
-- Constraints for table `penghuni_intensif`
--
ALTER TABLE `penghuni_intensif`
  ADD CONSTRAINT `penghuni_intensif_ibfk_1` FOREIGN KEY (`id_penghuni`) REFERENCES `penghuni_panti` (`id_penghuni`) ON DELETE CASCADE;

--
-- Constraints for table `penghuni_mandiri`
--
ALTER TABLE `penghuni_mandiri`
  ADD CONSTRAINT `penghuni_mandiri_ibfk_1` FOREIGN KEY (`id_penghuni`) REFERENCES `penghuni_panti` (`id_penghuni`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
