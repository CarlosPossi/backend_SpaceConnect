# **🚀 Space Connect - Advanced Programming & Mobile DEV**

API REST desenvolvida com Spring Boot para gerenciamento de Sistemas Monitorados, Sensores, Módulos Computacionais, Eventos Operacionais e Alertas Críticos.

---

## **📖 Descrição da API**

A API tem como objetivo monitorar sistemas computacionais por meio de Sensores, Módulos e Eventos Operacionais, permitindo registrar Alertas Críticos e acompanhar o estado dos componentes monitorados.

A aplicação disponibiliza endpoints REST para operações CRUD (**Create, Read, Update e Delete**) sobre as entidades do sistema.

---

##   **🗂️ Entidades do Projeto**

### **👁️‍🗨️ Sensor**

Representa um sensor responsável pela coleta de dados de monitoramento.

**📝 Atributos**

| Campo | Tipo |
|--------|------|
| id | Long |
| nome | String |
| tipo | String |
| status | String |
| valorAtual | Double |
| unidade | String |

**📄 Exemplo JSON**

```json
{
  "nome": "Sensor Temperatura",
  "tipo": "Temperatura",
  "status": "ATIVO",
  "valorAtual": 32.5,
  "unidade": "°C"
}
```

<br>

### **📡 Sistema Monitorado**

Representa um sistema acompanhado pela plataforma.

**📝 Atributos**

| Campo | Tipo |
|--------|------|
| id | Long |
| nome | String |
| status | String |
| descricao | String |
| sensor | Sensor |

**📄 Exemplo JSON**

```json
{
  "nome": "Sistema de Navegação",
  "status": "OFFLINE",
  "descricao": "Sistema responsável pela navegação",
  "sensor": {
    "id": 1
  }
}
```

<br>

### **🗃️ Módulo Computacional**

Representa módulos computacionais associados a um sistema monitorado.

**📝 Atributos**

| Campo | Tipo |
|--------|------|
| id | Long |
| nome | String |
| versao | String |
| status | String |
| sistemaMonitorado | SistemaMonitorado |

**📄 Exemplo JSON**

```json
{
  "nome": "Módulo IA",
  "versao": "v1.0",
  "status": "ALERTA",
  "sistemaMonitorado": {
    "id": 1
  }
}
```

<br>

### **⚙️ Evento Operacional**

Representa eventos operacionais registrados pelo sistema.

**📝 Atributos**

| Campo | Tipo |
|--------|------|
| id | Long |
| descricao | String |
| dataHora | String |
| severidade | String |
| sistemaMonitorado | SistemaMonitorado |

**📄 Exemplo JSON**

```json
{
  "descricao": "Falha no processamento",
  "dataHora": "2026-06-02T14:00:00",
  "severidade": "ALTA",
  "sistemaMonitorado": {
    "id": 1
  }
}
```

<br>

### **🚨 Alerta Crítico**

Representa alertas críticos emitidos pelo sistema.

**📝 Atributos**

| Campo | Tipo |
|--------|------|
| id | Long |
| mensagem | String |
| nivel | String |
| dataHora | String |
| ativo | Boolean |

**📄 Exemplo JSON**

```json
{
  "mensagem": "Temperatura acima do limite",
  "nivel": "CRITICO",
  "dataHora": "2026-06-02T18:20:00",
  "ativo": true
}
```

---

## **🌐 Endpoints Disponíveis**

### **👁️‍🗨️ Sensor**

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/sensores` | Listar sensores |
| GET | `/sensores/{id}` | Buscar sensor por ID |
| POST | `/sensores` | Criar sensor |
| PUT | `/sensores/{id}` | Atualizar sensor |
| DELETE | `/sensores/{id}` | Remover sensor |

<br>

### **📡 Sistema Monitorado**

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/sistemasmonitorados` | Listar sistemas |
| GET | `/sistemasmonitorados/{id}` | Buscar sistema por ID |
| POST | `/sistemasmonitorados` | Criar sistema |
| PUT | `/sistemasmonitorados/{id}` | Atualizar sistema |
| DELETE | `/sistemasmonitorados/{id}` | Remover sistema |

<br>

### **🗃️ Módulo Computacional**

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/moduloscomputacionais` | Listar módulos |
| GET | `/moduloscomputacionais/{id}` | Buscar módulo por ID |
| POST | `/moduloscomputacionais` | Criar módulo |
| PUT | `/moduloscomputacionais/{id}` | Atualizar módulo |
| DELETE | `/moduloscomputacionais/{id}` | Remover módulo |

<br>

### **⚙️ Evento Operacional**

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/eventosoperacionais` | Listar eventos |
| GET | `/eventosoperacionais/{id}` | Buscar evento por ID |
| POST | `/eventosoperacionais` | Criar evento |
| PUT | `/eventosoperacionais/{id}` | Atualizar evento |
| DELETE | `/eventosoperacionais/{id}` | Remover evento |

<br>

### **🚨 Alerta Crítico**

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/alertascriticos` | Listar alertas |
| GET | `/alertascriticos/{id}` | Buscar alerta por ID |
| POST | `/alertascriticos` | Criar alerta |
| PUT | `/alertascriticos/{id}` | Atualizar alerta |
| DELETE | `/alertascriticos/{id}` | Remover alerta |

---

## **🛠️ Tecnologias Utilizadas**

- Java 17
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Banco H2
- Maven
- Lombok

---

## **▶️ Como Rodar o Projeto**

**📃 Pré-requisitos**

Antes de iniciar, tenha instalado:

- Java 17+
- Maven
- IDE (IntelliJ, VSCode ou Eclipse)

**1. Clonar o projeto**

```bash
git clone <URL_DO_REPOSITORIO>
```

<br>

**2. Executar a aplicação**

```bash
cd connect
```

<br>

**3. Executar a aplicação**

*Pelo Maven Wrapper*

Windows:

```bash
mvnw.cmd spring-boot:run
```

<br>

Linux/Mac:

```bash
./mvnw spring-boot:run
```
Ou:

```bash
mvn spring-boot:run
```

<br>

**4. Acessar a API**

*Servidor local:*

```txt
http://localhost:8080
```

<br>

*Exemplo:*

```txt
http://localhost:8080/sensores
```

---

## **🗄️ Banco de Dados H2**

A aplicação utiliza banco H2 persistente em arquivo local.

### **🔧 Configuração**

```properties
spring.datasource.url=jdbc:h2:file:./data/consultas
spring.datasource.username=backend_SpaceConnect
spring.datasource.password=gsSpaceConnect
```

<br>

### **💻 Console H2**

Acesse:

```txt
http://localhost:8080/h2-console
```

<br>

### **🪛 Configurações**

<br>

*✉️ JDBC URL*

```txt
jdbc:h2:file:./data/consultas
```

<br>

*👤 User*

```txt
backend_SpaceConnect
```

<br>

*✒️ Password*

```txt
gsSpaceConnect
```

---

## **📁 Estrutura do Projeto**

```txt
src
 ├── controller
 │   ├── SensorController
 │   ├── SistemaMonitoradoController
 │   ├── EventoOperacionalController
 │   ├── ModuloComputacionalController
 │   └── AlertaCriticoController
 │
 ├── service
 │
 ├── repository
 │
 ├── model
 │
 └── resources
      └── application.properties
```

---

## **🔄 Operações CRUD**

A API suporta:

- ✅ Criar registros (`POST`)
- ✅ Buscar registros (`GET`)
- ✅ Atualizar registros (`PUT`)
- ✅ Remover registros (`DELETE`)

---

## **👨‍💻 Desenvolvido com Spring Boot**

Projeto acadêmico de API REST para gerenciamento e monitoramento de sistemas computacionais.

---

### **👥 Integrantes do Projeto**

- 🧔🏻‍♂️ **Nome:** Carlos Augusto da Cruz Possi  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; **RM:** 558758

- 👦🏻 **Nome:** Fabio Henrique dos Santos Farias  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; **RM:** 552453

- 🧑🏻‍🦱 **Nome:** João Pedro Bernardo Santos da Silva &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  **RM:** 557142

