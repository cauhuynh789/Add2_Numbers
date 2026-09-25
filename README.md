# Project Add2Num - High-Level Requirement v1.8

Dự án cài đặt thư viện lõi (core) thực hiện thuật toán cộng hai số lớn dạng chuỗi ký tự theo nguyên lý phép cộng tiểu học.

## Cấu trúc thư mục

```
Add2_Numbers/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── test/
│   │               └── Add2_Numbers/
│   │                   └── MyBigNumber.java
│   └── test/
│       └── java/
│           └── com/
│               └── test/
│                   └── Add2_Numbers/
│                       └── MyBigNumberTest.java
├── pom.xml
└── README.md
```

## Yêu cầu môi trường
- Java JDK 11 hoặc cao hơn
- Apache Maven 3.6+

## Hướng dẫn Biên dịch và Chạy Unit Test

1. Biên dịch dự án:
   ```bash
   mvn clean compile
   ```

2. Chạy bộ kiểm thử tự động (Unit Test):
   ```bash
   mvn test
   ```

## Hướng dẫn thao tác Git & Đưa lên nhánh `core`

1. Khởi tạo repository và chuyển sang nhánh `core`:
   ```bash
   git init
   git checkout -b core
   ```

2. Commit mã nguồn:
   ```bash
   git add .
   git commit -m "Thêm thư viện lõi MyBigNumber và Unit Test"
   ```

3. Đẩy lên Git Server công khai:
   ```bash
   git remote add origin https://github.com/youraccount/Add2_Numbers.git
   git push -u origin core
   ```

4. Tạo Tag phiên bản 0.0.1:
   ```bash
   git tag -a 0.0.1 -m "Phát hành phiên bản 0.0.1"
   git push origin 0.0.1
   ```

## Hướng dẫn Clone thử nghiệm về thư mục quy ước
Để giả lập vị trí lưu trữ của người dùng khác:
- Đối với Windows:
  ```bash
  git clone -b core https://github.com/youraccount/Add2_Numbers.git D:\Projects\github.com\youraccount\Add2_Numbers
  ```
- Đối với MacOS / Linux:
  ```bash
  git clone -b core https://github.com/youraccount/Add2_Numbers.git ~/Projects/github.com/youraccount/Add2_Numbers
  ```
