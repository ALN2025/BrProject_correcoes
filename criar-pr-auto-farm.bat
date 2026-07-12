@echo off
echo ========================================
echo SCRIPT PARA CRIAR PULL REQUEST NO GITHUB
echo Dev ⩿ A.L.N/⪀ - Auto Farm Visual Fix
echo ========================================
echo.
echo PASSO 1: Gere um token de acesso pessoal no GitHub
echo   - Acesse: https://github.com/settings/tokens
echo   - Clique em "Generate new token"
echo   - Selecione escopo "repo" (acesso completo a repositórios)
echo   - Copie o token gerado
echo.
echo PASSO 2: Configure seu token abaixo:
set /p GH_TOKEN=Digite seu token GitHub (não será exibido): 
echo.
echo PASSO 3: Criando Pull Request...
echo.
echo Título: fix: Remove círculo amarelo da visualização do auto farm
echo Repositório: Dhousefe/Public_Brproject
echo Branch: ALN2025:fix-auto-farm-yellow-circle -> main
echo.
echo Aguarde...

curl -X POST ^
  -H "Authorization: token %GH_TOKEN%" ^
  -H "Accept: application/vnd.github.v3+json" ^
  https://api.github.com/repos/Dhousefe/Public_Brproject/pulls ^
  -d "{\"title\": \"fix: Remove círculo amarelo da visualização do auto farm\", \"body\": \"## Problema identificado pelo Dev A.L.N/⪀\\n\\nQuando ativava o auto farm no meu servidor BrProject, aparecia um círculo com borda amarela que dependia do ângulo de visão.\\n\\n**Problemas encontrados:**\\n1. Em catacombs/paredes - O círculo aparecia nas paredes e ficava visualmente feio\\n2. Em área aberta - Mostrava um círculo grande com borda amarela que distraía a jogabilidade\\n3. Ao ajustar range - Continua mostrando o preview visual mesmo quando não desejado\\n\\n**Solução aplicada:**\\nDesabilitei completamente a visualização do círculo amarelo sem alterar a funcionalidade (6 arquivos modificados).\\n\\n**Testado:** ✅ Auto farm funciona 100% normalmente sem mostrar o círculo\\n**Mantido:** Range de ataque, limites de área, toda funcionalidade\\n**Commit:** fix: remove-auto-farm-yellow-circle-visualization-20260709-v2\\n\\n**Dev ⩿ A.L.N/⪀**\\n*Desenvolvedor que testa e corrige o projeto BrProject*\", \"head\": \"ALN2025:fix-auto-farm-yellow-circle\", \"base\": \"main\"}"

echo.
echo ========================================
echo Se o comando acima falhar, faça manualmente:
echo 1. Acesse: https://github.com/Dhousefe/Public_Brproject/pulls
echo 2. Clique em New pull request
echo 3. Configure: base repository: Dhousefe/Public_Brproject, base: main
echo 4. Configure: head repository: ALN2025/Public_Brproject_DevALN, compare: fix-auto-farm-yellow-circle
echo 5. Use o título e descrição acima
echo ========================================
pause