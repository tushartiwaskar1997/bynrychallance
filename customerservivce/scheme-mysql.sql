CREATE TABLE `customer` (
  `customerid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customerid`),
  UNIQUE KEY `customerid` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `servicetyp` (
  `serviceid` int(11) NOT NULL AUTO_INCREMENT,
  `servicename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`serviceid`),
  UNIQUE KEY `serviceid` (`serviceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `status` (
  `statusid` int(11) NOT NULL AUTO_INCREMENT,
  `customerid` int(11) NOT NULL,
  `serviceid` int(11) NOT NULL,
  `service_status` varchar(255) DEFAULT NULL,
  `req_date` date DEFAULT NULL,
  `req_time` time(6) DEFAULT NULL,
  `comp_date` date DEFAULT NULL,
  `comp_time` time(6) DEFAULT NULL,
  PRIMARY KEY (`statusid`),
  UNIQUE KEY `statusid` (`statusid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci