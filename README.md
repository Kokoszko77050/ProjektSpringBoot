# Zadanie - Spring Boot API

---

## Opis zadania

Zadanie polegało na przygotowaniu prostej aplikacji backendowej stworzonej w technologii Java Spring Boot. Aplikacja udostępnia podstawowy endpoint API, który zwraca dane w formacie JSON.

Celem zadania było pokazanie działania aplikacji internetowej po stronie backendu oraz uruchomienie jej lokalnie.

---

## Funkcjonalności

### Endpoint testowy

Aplikacja posiada endpoint dostępny pod adresem:

/hello

Po wejściu na ten adres użytkownik otrzymuje odpowiedź JSON zawierającą:

- wiadomość testową,
- imiona i nazwiska autorów,
- numery indeksów.

Przykładowa odpowiedź:

{
  "message": "Hello from Spring Boot!",
  "autorzy": "Bartosz Kokoszko, Nikita Bielan",
  "indeksy": "77050, 77336"
}

---

## Wykorzystane technologie

### Backend

- Java
- Spring Boot
- Gradle

### Serwer aplikacji

- Apache Tomcat wbudowany w Spring Boot

### Kontrola wersji

- Git
- GitHub

---

## Architektura systemu

Zadanie ma prostą strukturę aplikacji Spring Boot. Główna klasa uruchamia aplikację, a kontroler odpowiada za obsługę żądania HTTP.

Najważniejsze elementy zadania:

- ProjektApplication - klasa startowa aplikacji,
- HelloController - kontroler obsługujący endpoint /hello,
- application.properties - plik konfiguracyjny aplikacji,
- build.gradle - konfiguracja projektu i zależności.

Schemat działania aplikacji:

Użytkownik
    |
    v
Przeglądarka / klient HTTP
    |
    v
Endpoint /hello
    |
    v
HelloController
    |
    v
Odpowiedź JSON

---

## Struktura projektu

projekt/
|
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/projekt/
│       │       ├── ProjektApplication.java
│       │       └── HelloController.java
│       │
│       └── resources/
│           └── application.properties
│
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
└── README.md

---

## Uruchomienie lokalne

Aby uruchomić aplikację lokalnie, należy mieć zainstalowaną Javę oraz użyć Gradle Wrapper znajdującego się w projekcie.

### Windows

gradlew.bat bootRun

lub w PowerShell:

.\gradlew.bat bootRun

### Linux / macOS

chmod +x gradlew
./gradlew bootRun

Po uruchomieniu aplikacja będzie dostępna pod adresem:

http://localhost:8080/hello

---

## Konfiguracja portu

Aplikacja lokalnie działa na porcie 8080.

W pliku application.properties znajduje się konfiguracja:

spring.application.name=projekt
server.port=${PORT:8080}

Dzięki temu aplikacja może działać lokalnie na porcie 8080, a po wdrożeniu online może korzystać z portu ustawionego automatycznie przez platformę hostingową.

---

## Test działania aplikacji

Po uruchomieniu aplikacji należy wejść w przeglądarce na adres:

http://localhost:8080/hello

Jeżeli aplikacja działa poprawnie, zostanie wyświetlona odpowiedź w formacie JSON z informacją o autorach oraz numerach indeksów.

---

## Autorzy

- Bartosz Kokoszko - 77050
- Nikita Bielan - 77336
