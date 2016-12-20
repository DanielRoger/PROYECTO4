-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-12-2016 a las 18:25:19
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.28


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_estoc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_categoria`
--


--
-- Volcado de datos para la tabla `tbl_categoria`
--

INSERT INTO `tbl_categoria` (`categoria_id`, `categoria_nom`) VALUES
(1, 'dormitorio'),
(2, 'salón'),
(3, 'comedor'),
(4, 'cocina'),
(5, 'baño');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_comanda`
--

--
-- Volcado de datos para la tabla `tbl_comanda`
--

INSERT INTO `tbl_comanda` (`comanda_id`, `comanda_quantitat`, `comanda_data`, `prov_id`) VALUES
(1, 8, '2016-12-06', 1),
(2, 6, '2016-12-09', 2),
(3, 4, '2016-12-07', 3),
(4, 2, '2016-12-10', 4),
(5, 7, '2016-12-12', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_detall_com`
--

--
-- Volcado de datos para la tabla `tbl_detall_com`
--

INSERT INTO `tbl_detall_com` (`detall_com_id`, `comanda_id`, `prod_id`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5),
(6, 1, 6),
(7, 2, 7),
(8, 3, 8),
(9, 4, 9),
(10, 5, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_estoc`
--

--
-- Volcado de datos para la tabla `tbl_estoc`
--

INSERT INTO `tbl_estoc` (`estoc_id`, `estoc_q_max`, `estoc_quantitat`, `estoc_q_min`, `prod_id`, `lloc_id`) VALUES
(1, 10, 5, 2, 1, 1),
(2, 10, 5, 2, 2, 2),
(3, 10, 5, 2, 3, 3),
(4, 10, 5, 2, 4, 4),
(5, 10, 5, 2, 5, 5),
(6, 10, 5, 2, 6, 6),
(7, 10, 5, 2, 7, 7),
(8, 10, 5, 2, 8, 8),
(9, 10, 5, 2, 9, 9),
(10, 10, 5, 2, 10, 10),
(11, 10, 5, 2, 11, 11),
(12, 10, 5, 2, 12, 12),
(13, 10, 5, 2, 13, 13),
(14, 10, 5, 2, 14, 14),
(15, 10, 5, 2, 15, 15),
(16, 10, 5, 2, 16, 16),
(17, 10, 5, 2, 17, 17),
(18, 10, 5, 2, 18, 18),
(19, 10, 5, 2, 19, 19),
(20, 10, 5, 2, 20, 20),
(21, 10, 5, 2, 21, 21),
(22, 10, 5, 2, 22, 22),
(23, 10, 5, 2, 23, 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_lloc`
--


--
-- Volcado de datos para la tabla `tbl_lloc`
--

INSERT INTO `tbl_lloc` (`lloc_id`, `num_bloc`, `num_passadis`, `num_lleixa`) VALUES
(1, 'Bloc 1', 'passadis 1', 'lleixa 1'),
(2, 'Bloc 1', 'passadis 1', 'lleixa 2'),
(3, 'Bloc 1', 'passadis 1', 'lleixa 3'),
(4, 'Bloc 1', 'passadis 1', 'lleixa 4'),
(5, 'Bloc 1', 'passadis 1', 'lleixa 5'),
(6, 'Bloc 1', 'passadis 1', 'lleixa 6'),
(7, 'Bloc 1', 'passadis 1', 'lleixa 7'),
(8, 'Bloc 1', 'passadis 1', 'lleixa 8'),
(9, 'Bloc 1', 'passadis 2', 'lleixa 1'),
(10, 'Bloc 1', 'passadis 2', 'lleixa 2'),
(11, 'Bloc 1', 'passadis 2', 'lleixa 3'),
(12, 'Bloc 1', 'passadis 2', 'lleixa 4'),
(13, 'Bloc 1', 'passadis 2', 'lleixa 5'),
(14, 'Bloc 1', 'passadis 2', 'lleixa 6'),
(15, 'Bloc 1', 'passadis 2', 'lleixa 7'),
(16, 'Bloc 1', 'passadis 2', 'lleixa 8'),
(17, 'Bloc 2', 'passadis 3', 'lleixa 1'),
(18, 'Bloc 2', 'passadis 3', 'lleixa 2'),
(19, 'Bloc 2', 'passadis 3', 'lleixa 3'),
(20, 'Bloc 2', 'passadis 3', 'lleixa 3'),
(21, 'Bloc 2', 'passadis 3', 'lleixa 4'),
(22, 'Bloc 2', 'passadis 3', 'lleixa 5'),
(23, 'Bloc 3', 'passadis 1', 'lleixa 1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_producte`
--

--
-- Volcado de datos para la tabla `tbl_producte`
--

INSERT INTO `tbl_producte` (`prod_id`, `prod_nom`, `prod_foto`, `prod_preu`, `serie_id`) VALUES
(1, 'cama doble', '1.jpg', 110, 1),
(2, 'cama individual', '2.jpg', 70, 1),
(3, 'colchón de muelles', '3.jpg', 60, 2),
(4, 'viscoelástico', '4.jpg', 90, 2),
(5, 'armario dormitorio', '5.jpg', 130, 3),
(6, 'mesita de noche', '6.jpg', 30, 3),
(7, 'lámpara led', '7.jpg', 20, 4),
(8, 'lámpara regulable', '8.jpg', 30, 4),
(9, 'sofá individual', '9.jpg', 80, 5),
(10, 'sofá multiple', '10.jpg', 90, 5),
(11, 'mueble tv blanco', '11.jpg', 200, 6),
(12, 'mueble tv negro', '12.jpg', 200, 6),
(13, 'armario de salón', '13.jpg', 190, 7),
(14, 'vitrina de salón', '14.jpg', 250, 7),
(15, 'mesa de madera', '15.jpg', 150, 8),
(16, 'mesa de cristal', '16.jpg', 180, 8),
(17, 'silla blanca', '17.jpg', 20, 9),
(18, 'silla negra', '18.jpg', 20, 9),
(19, 'nevera', '19.jpg', 0, 300),
(20, 'lavavajillas', '20.jpg', 330, 10),
(21, 'panel bonito', '21.jpg', 20, 11),
(22, 'panel económico', '22.jpg', 10, 11),
(23, 'armario básico', '23.jpg', 80, 12),
(24, 'armario con espejo', '24.jpg', 100, 12),
(25, 'espejo pequeño', '25.jpg', 50, 13),
(26, 'espejo grande', '26.jpg', 100, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_proveidor`
--

--
-- Volcado de datos para la tabla `tbl_proveidor`
--

INSERT INTO `tbl_proveidor` (`prov_id`, `prov_nom`, `prov_adre`, `prov_email`) VALUES
(1, 'prov_dormitorio', 'c/prov_dormitorio', 'dormitorio@prov.com'),
(2, 'prov_salón', 'c/prov_salón', 'salon@prov.com'),
(3, 'prov_comedor', 'c/prov_comedor', 'comedor@prov.com'),
(4, 'prov_cocina', 'c/prov_cocina', 'cocina@prov.com'),
(5, 'prov_baño', 'c/prov_baño', 'baño@prov.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_serie`
--


--
-- Volcado de datos para la tabla `tbl_serie`
--

INSERT INTO `tbl_serie` (`serie_id`, `serie_nom`, `categoria_id`) VALUES
(1, 'camas', 1),
(2, 'colchones', 1),
(3, 'almacenaje de dormitorio', 1),
(4, 'iluminación', 1),
(5, 'sofás y sillones', 2),
(6, 'soluciones multimedia', 2),
(7, 'almacenaje de salones', 2),
(8, 'mesas de comedor', 3),
(9, 'sillas de comedor', 3),
(10, 'electrodomésticos', 4),
(11, 'paneles de pared', 4),
(12, 'armarios para lavabos', 5),
(13, 'espejos de baño', 5);
