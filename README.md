# sql
```sql
CREATE TABLE `books` (
  `bookID` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(255) DEFAULT '' COMMENT '书名',
  `bookCounts` int(11) DEFAULT '0' COMMENT '数量',
  `detail` varchar(255) DEFAULT '' COMMENT '描述',
  PRIMARY KEY (`bookID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
INSERT INTO `ssmbuild`.`books` (`bookID`, `bookName`, `bookCounts`, `detail`) VALUES (1, '书籍1', 1, '书');
INSERT INTO `ssmbuild`.`books` (`bookID`, `bookName`, `bookCounts`, `detail`) VALUES (2, '书籍2', 2, '书');
```