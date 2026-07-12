# BrProject Correções 🔧

Repositório dedicado a correções, melhorias e refatorações do projeto **BrProject**. Este repositório centraliza todas as correções de build, deprecações de API e implementações de novas funcionalidades antes de serem submetidas ao repositório oficial.

## 📋 Sobre

Este repositório é um **hub de correções** que organiza e gerencia:
- Correções de compatibilidade com Java 21+
- Remoção de deprecated APIs
- Limpeza de código e imports não utilizados
- Implementação de novas funcionalidades
- Paginação e melhorias UX

Cada correção passa por validação local antes de gerar um Pull Request para o repositório oficial: [Dhousefe/Public_Brproject](https://github.com/Dhousefe/Public_Brproject)

## ✅ Correções Implementadas

### 📌 v1 - Fix/Corrections-v1
Correções iniciais de compatibilidade e limpeza de código:

#### 1. **API Locale Deprecada** (Java 19+)
- Substituição de `new Locale(String, String)` por `Locale.forLanguageTag(String)`
- **Arquivo:** `java/ext/mods/gameserver/handler/voicedcommandhandlers/VoicedLang.java`
- **Instâncias:** 5 correções
- **Impacto:** Compatibilidade com Java 21

#### 2. **Limpeza de Imports e Campos Não Usados**
- Removido import não utilizado `CountryLocaleManager` em `EnterWorld.java`
- Adicionado `@SuppressWarnings("unused")` em `DonationManager.java`
- **Arquivo:** `java/ext/mods/gameserver/network/clientpackets/EnterWorld.java`
- **Arquivo:** `java/net/sf/donationmanager/DonationManager.java`

#### 3. **Paginação do PIX** 
- Implementação de paginação para busca de criptomoedas
- Usa classe `Pagination<Entry<String, BigDecimal>>`
- **Limite:** 8 itens por página
- **Navegação:** Botões "Anterior/Próximo"
- **Arquivo:** `java/net/sf/donationmanager/DonationManager.java` (lines 1024+)

#### 4. **Correção de Caminhos de Configuração**
- Atualização de paths no `Config.java`
- **De:** `config/Pix.properties` → **Para:** `game/config/custom/Pix.properties`
- **De:** `config/BossJewelUpgrades.properties` → **Para:** `game/config/BossJewelUpgrades.properties`
- **Arquivo:** `java/ext/mods/Config.java`

#### 5. **Sistema de Detecção de País**
- Novo arquivo: `country_locales.map` com mapeamento país → idioma
- Configuração em `language.properties` para ativar detecção automática
- **Suporta:** BR→pt-BR, US→en-US, RU→ru-RU, e outros
- **Arquivo:** `game/config/country_locales.map` (novo)
- **Arquivo:** `game/config/language.properties`

## 🧪 Status de Validação

✅ **Build:** Compilado com sucesso via `ant compile`  
✅ **Sintaxe:** Sem erros de sintaxe  
✅ **JAR:** Gerado corretamente em `libs/server.jar`  
✅ **Commits:** Todos os commits com mensagens descritivas  

## 📁 Estrutura

```
BrProject_correcoes/
├── README.md                                    # Este arquivo
├── java/
│   ├── ext/
│   │   └── mods/
│   │       ├── gameserver/
│   │       │   ├── handler/voicedcommandhandlers/
│   │       │   │   └── VoicedLang.java         # Correção Locale (5x)
│   │       │   └── network/clientpackets/
│   │       │       └── EnterWorld.java         # Remove unused import
│   │       └── Config.java                     # Paths corrigidos
│   └── net/
│       └── sf/donationmanager/
│           └── DonationManager.java            # Paginação + cleanup
└── game/
    └── config/
        ├── language.properties                 # Config país
        └── country_locales.map                 # Mapa país→idioma (novo)
```

## 🚀 Como Usar

### Clonar o Repositório
```bash
git clone https://github.com/ALN2025/BrProject_correcoes.git
cd BrProject_correcoes
```

### Compilar
```bash
ant compile
```

### Validar
```bash
git status
git log --oneline
```

### Submeter PR
Cada correção é submetida como um Pull Request para o repositório oficial:
- **Base:** `Dhousefe/Public_Brproject:main`
- **Compare:** `ALN2025/BrProject_correcoes:fix/corrections-v1`

## �️ Estrutura de Correção na Raiz

A pasta `correcao/` na raiz do repositório é o local onde devem ficar todas as alterações copiadas do fork.
Este repositório funciona como um hub de correções:
- alterações feitas no fork são organizadas em `correcao/`
- o conteúdo atualizado é usado para gerar PRs para o repositório oficial
- aqui ficam correções do mod PIX, ajustes de configuração e implementações

## 🏆 Minhas Contribuições (Dev ⩿ A.L.N/⪀)

Esta seção documenta minhas contribuições principais para a correção e melhoria do projeto.

- **Correção de compatibilidade Java:** Atualização de APIs `Locale` deprecadas para `Locale.forLanguageTag()`.
- **Limpeza de código:** Remoção de imports não usados e anotações de supressão onde necessário.
- **Implementação de paginação do PIX:** Melhor experiência de listagem de criptomoedas com navegação de páginas.
- **Ajuste de configuração:** Correção dos caminhos de propriedades para `game/config/`.
- **Detecção de idioma por país:** Novo mapeamento `country_locales.map` e suporte automático de locale.

## �🔗 Links

- **Repositório Oficial:** https://github.com/Dhousefe/Public_Brproject
- **Fork do Usuário:** https://github.com/ALN2025/Public_Brproject
- **Este Repositório:** https://github.com/ALN2025/BrProject_correcoes

## 📝 Workflow de Contribuição

1. Criar branch com padrão: `fix/description` ou `feat/description`
2. Implementar correção/funcionalidade
3. Validar com `ant compile`
4. Fazer commit descritivo em português
5. Gerar PR para repositório oficial quando pronto

## ⚙️ Tecnologias

- **Java:** 21+
- **Build:** Apache Ant
- **VCS:** Git + GitHub
- **Locale:** Sistema multi-idioma (pt-BR, en_US, ru_RU, etc.)

## 📞 Contato

Para dúvidas sobre as correções, verifique os commits e PRs associados no repositório oficial.

---

**Status:** ✨ Pronto para PRs  
**Última Atualização:** 2026-07-12
