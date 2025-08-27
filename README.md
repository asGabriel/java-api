# 🚀 Java REST API - Portfolio Project

**Demonstração de desenvolvimento backend com Java e Spring boot.**

## 🛠️ Stack Técnica

- **Java 21** - Versão LTS mais recente
- **Spring Boot 3.5.4** - Framework principal (Web, Data JPA)
- **PostgreSQL** - Banco de dados principal
- **H2** - Banco in-memory para testes
- **Flyway** - Migração e versionamento de banco
- **Maven** - Gerenciamento de dependências
- **Lombok** - Redução de boilerplate
- **Jakarta Persistence (JPA)** - ORM

## 🏗️ Arquitetura & Conceitos Aplicados

### **Hexagonal Architecture (Ports & Adapters)**
```
├── domain/
│   ├── model/          # Entidades de negócio
│   └── ports/          # Interfaces (contratos)
├── application/
│   └── usecases/       # Regras de negócio
└── infrastructure/
    └── adapters/
        ├── in/         # Controllers (entrada)
        └── out/        # Repositories (saída)
```

### **Principais Skills Demonstradas**
- ✅ **Clean Architecture** - Separação clara de responsabilidades
- ✅ **SOLID Principles** - Código extensível e maintível  
- ✅ **Dependency Injection** - Baixo acoplamento
- ✅ **Repository Pattern** - Abstração de persistência
- ✅ **Use Cases Pattern** - Lógica de negócio isolada
- ✅ **Entity Mapping** - Separação entre domain e persistence
- ✅ **Database Migrations** - Versionamento controlado

## 🎯 Funcionalidades
- **API REST** para gerenciamento financeiro
- **Bot Telegram** integrado para interação via chat
- **Comandos disponíveis:**
  - `/listar` - Lista todas as despesas cadastradas
  - `/despesa` - Criar nova despesa (em desenvolvimento)

## 🚀 Como Executar

### **Pré-requisitos**
- Java 21+
- Maven 3.6+
- Bot do Telegram configurado

### **1. Configurar Bot do Telegram**
1. Crie um bot no `@BotFather` (Telegram)
2. Obtenha o **token** do bot
3. Obtenha o **chat_id** onde o bot será usado

### **2. Configurar Variáveis de Ambiente**
```bash
export TELEGRAM_TOKEN="seu-bot-token-aqui"
export TELEGRAM_API_URL="https://api.telegram.org"
```

### **3. Executar Aplicação**
```bash
# Com Maven instalado
mvn spring-boot:run
```

### **4. Configurar Webhook (Para receber mensagens)**
```bash
# Para desenvolvimento local, use ngrok:
ngrok http 8080

# Configure o webhook do Telegram:
curl -X POST "https://api.telegram.org/bot<SEU_TOKEN>/setWebhook" \
     -H "Content-Type: application/json" \
     -d '{"url": "https://sua-url-ngrok.com/webhook"}'
```

---
*Projeto desenvolvido para demonstrar proficiência em desenvolvimento backend Java com foco em arquitetura limpa e boas práticas.*
