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

## 🎯 Funcionalidade
API REST para gerenciamento de débitos financeiros com operações CRUD básicas.

---
*Projeto desenvolvido para demonstrar proficiência em desenvolvimento backend Java com foco em arquitetura limpa e boas práticas.*
