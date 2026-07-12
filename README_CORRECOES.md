# BrProject Correções

Repositório dedicado a correções, melhorias e implementações de funcionalidades do projeto BrProject.

## Sobre

Este repositório centraliza todas as correções que são validadas localmente antes de serem submetidas ao repositório oficial.

## Correções Implementadas

### Auto Farm Visual - Remoção do Círculo Amarelo

**Problema:** O auto farm exibia um círculo amarelo que aparecia nas paredes das catacombs e em áreas abertas, comprometendo a jogabilidade.

**Solução:** Desabilitado completamente a visualização do círculo amarelo, mantendo toda a funcionalidade do auto farm intacta.

**Arquivos modificados:**
- MovementIntegration.java
- ZoneBuilder.java
- ZoneCylinderZ.java
- AutoFarmRoute.java
- AutoFarmZone.java
- AutoFarmManager.java

**Status:** ✅ Compilado e testado

---

### Mod PIX / DonationManager

**Implementação:** Sistema de doações com suporte a PIX (BRL) e PayPal (USD), incluindo QR Code, sistema de pagamentos e comandos `.pix` e `.pay`.

**Funcionalidades:**
- Pagamento via PIX (BRL)
- Pagamento via PayPal (USD)
- QR Code para pagamentos
- Sistema de pagamentos
- Comandos `.pix` e `.pay`
- Integração com CommunityBoard

**Arquivos:**
- DonationPixAccess.java
- Pix.java
- CustomCommunityBoard.java
- GameServer.kt
- build.gradle.kts (dependências adicionadas)

**Status:** ✅ Compilado e testado

---

### GK Global (NPC 50010) - Correção de HTML

**Problema:** Arquivo HTML estava ausente na pasta `game/data/html/`, causando falhas no carregamento do GK Global.

**Solução:** Copiado HTML completo do `Brproject_Distribution` para `game/data/html/` e adicionada substituição de variáveis `%name%` e `%timer%`.

**Arquivos:**
- 50010.htm (HTML completo do GK Global)
- GateKeeperBBSManager.java (substituição de variáveis)

**Status:** ✅ Compilado e testado

---

### Enchanter Zone - Mensagem de Chance

**Problema:** O símbolo `%` estava sendo interpretado como variável no lugar de ser exibido literalmente.

**Solução:** Escapado o símbolo `%` usando `\\%` na mensagem.

**Arquivo:** RandomManager.java

**Status:** ✅ Compilado e testado

---

## Como Aplicar

1. Copie os arquivos da pasta `correcao/` para a raiz do projeto
2. Execute `ant compile` e `ant jar` para recompilar
3. O server.jar atualizado estará em `libs/server.jar`

## Commits

Todos os commits seguem o padrão em português e incluem a assinatura `Dev ⩿ A.L.N/⪀`.

**Commits incluídos na branch correcoes-v1:**
- chore: fix deprecated Locale usage, remove unused imports, implement pagination
- fix: gk-global-html-and-compile-20260711
- fix: add-name-and-timer-substitution-gk-20260711
- fix: escape-percent-in-enchanter-zone-message-20260711
- fix: add-missing-ranklist.htm-file-20260711
- feat: add-pix-mod-donation-system-20260711
- fix: remove-auto-farm-yellow-circle-visualization-20260711

## Status

✅ Validado localmente  
✅ Compilado com sucesso  
✅ Pronto para PR para o repositório oficial

---

**Dev ⩿ A.L.N/⪀ | 12/07/2026**
