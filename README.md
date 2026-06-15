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
Adicione aqui prints da tela inicial e da tela com resultado.

## Autor
Eduarda Guimarães Monteiro (2577579)
