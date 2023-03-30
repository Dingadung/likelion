#  변수 ⇒ 데이터가 저장되는 공간

1. 1개의 변수에는 1개의 값만 할당 가능하다.
2. 변수에 저장된 값 => 재할당을 통해 변경 가능하다.
3. 값의 형태에 맞는 자료형을 사용해야 한다.
4. 변수명은 소문자로 시작해야 한다.(관습)
5. 대소문자를 구분한다, 공백 포함 불가능
6. 자바 예약어는 변수이름으로 사용할 수 없다.

---
# Primitive Type
## 정수형
1. byte (1 byte = 8bits) : -2^7 ~ 2^7-1 (-128 ~ 127)
2. short (2bytes): -2^15 ~ 2^15-1 (-32768~ 32767)
3. int (4bytes): -2^31 ~ 2^31-1
4. long (8bytes): -2^63 ~ 2^63-1

## 실수형
1. double (8bytes) - 15자리
2. float (4bytes) - 7자라

## 문자형
1. char (2bytes) ← 정수 들어가면 ASCII로 변환

## 논리형
1. boolean(1 byte)

---
#  참조형
참조형 데이터의 값 ⇒ 힙 메모리 영역
변수에 대입되는 값 ⇒ 힙 메모리 영역의 주소 

---
# 형변환
byte < short < int < long << float < double

---
# String ⇒ 문자열 객체
객체 ⇒ 힙 메모리 영역
변수 ⇒ 힙 메모리 영역의 주소

리터럴: 값 자체

```java
String hello = "안녕하세요"; // 스트링 리터럴
```

```java
String hello = new String("안녕하세요"); // 생성자
```
→ 생성자를 이용하면 항상 공간이 새로 생성되지만, 리터럴은 값이 같으면 같은 공간에서 이용된다.

## equals()
`equals()` 라는 함수를 사용하면 값 자체를 비교하게 된다.

## StringBuilder
`StringBuilder` 는 String 객체를 합쳐준다.
메모리 측면에서 효율적이다.
```java
StringBuilder hello = new StringBuilder("hello, ");
hello.append("World!");
System.out.println(hello.toString());
```

## 문자열 슬라이스
```java
String str = "이름: 박지민"
System.out.println(str.indexOf("이")); // 0

String name = str.subString(4, 8); // 박지민
```

## 문자열 대소문자 변환
### toUpperCase()
소문자 → 대문자

### toLowerCaser()
대문자 → 소문자

### equalsIgnoreCase()
→ 대소문자를 구분하지 않고 문자열 값을 비교한다.

## 문자열 공백 제거
1. 양쪽 끝 공백 제거 → `trim()`
```java
String str = "          Hello     ";
str = str.trim();
```

2. 문자열 공백 제거 → `replace()`
```java
String str = "          Hel   lo     ";
str = str.trim();
str = str.replace(" ", "");
```