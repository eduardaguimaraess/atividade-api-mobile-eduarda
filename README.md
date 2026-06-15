# WeatherNow

## Descrição
Aplicativo Android desenvolvido em Kotlin que permite consultar o clima de uma cidade em tempo real. O app facilita o acesso a informações climáticas de forma rápida, exibindo dados úteis como temperatura atual, máxima e mínima, umidade, vento e condição do clima.

## API utilizada
- Nome da API: wttr.in
- Endpoint utilizado: https://wttr.in/{cidade}?format=j1
- Exemplo de URL consultada: https://wttr.in/Muriae?format=j1
- Principais dados retornados:
  - Temperatura atual (temp_C)
  - Sensação térmica (FeelsLikeC)
  - Umidade (humidity)
  - Velocidade do vento (windspeedKmph)
  - Descrição do clima (weatherDesc)
  - Temperatura mínima e máxima do dia (mintempC e maxtempC)

## Funcionalidades
- Entrada de dados pelo usuário
- Validação de campo vazio
- Consulta a uma API pública
- Exibição dos dados retornados
- Tratamento básico de erro

## Tecnologias utilizadas
- Kotlin
- Android Studio
- XML
- Biblioteca de requisição utilizada: Volley
- API pública escolhida: wttr.in

## Permissões utilizadas
O aplicativo utiliza a permissão INTERNET para realizar requisições à API pública.

```xml
<uses-permission android:name="android.permission.INTERNET" />
````

## Como executar o projeto
1. Clonar este repositório.
2. Abrir o projeto no Android Studio.
3. Aguardar a sincronização do Gradle.
4. Executar o app em um emulador ou dispositivo físico.
5. Informar um dado válido e realizar a consulta.

## Prints do aplicativo
<img width="1910" height="1033" alt="image" src="https://github.com/user-attachments/assets/95068b49-c200-4f81-a134-d5a031a69835" />
<img width="1914" height="1032" alt="image" src="https://github.com/user-attachments/assets/d403ab05-4746-4905-ad7f-977944d77dbe" />
<img width="1909" height="1030" alt="image" src="https://github.com/user-attachments/assets/a367d231-9fad-4479-9b8c-83a7e87b047a" />
<img width="1914" height="1030" alt="image" src="https://github.com/user-attachments/assets/3da00641-2160-4c7b-9418-f3a528bb92b1" />


## Autor
Eduarda Guimarães Monteiro (2577579)
