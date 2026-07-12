@echo off
echo Criando Pull Request...
echo.
echo Abra a URL abaixo no navegador para criar o PR:
echo.
echo https://github.com/Dhousefe/Public_Brproject/compare/main...ALN2025:fix-auto-farm-yellow-circle?expand=1
echo.
echo Título: Fix Auto Farm Visual + Add Pix Mod
echo.
echo Corpo do PR:
echo.
echo ## O que foi feito
echo.
echo - **Auto Farm Visual**: Removida visualização do círculo amarelo que aparecia nas paredes das catacombs e em áreas abertas. A funcionalidade do auto farm continua intacta.
echo.
echo - **Pix Mod**: Implementado sistema de doações com pagamento via PIX (BRL), PayPal (USD), QR Code, sistema de pagamentos, comandos .pix e .pay, integração com CommunityBoard.
echo.
echo ## Arquivos modificados
echo.
echo - MovementIntegration.java, AutoFarmManager.java, ZoneBuilder.java, AutoFarmRoute.java, AutoFarmZone.java, ZoneCylinderZ.java (auto farm visual)
echo - DonationPixAccess.java, Pix.java, CustomCommunityBoard.java, GameServer.kt, Build dependencies (pix mod)
echo.
echo ## Como testar
echo.
echo 1. Compile com gradlew jar
echo 2. Teste o auto farm - não deve mais aparecer círculo amarelo
echo 3. Teste os comandos .pix e .pay no CommunityBoard
echo.
echo Dev ⩿ A.L.N/⪀
echo.
