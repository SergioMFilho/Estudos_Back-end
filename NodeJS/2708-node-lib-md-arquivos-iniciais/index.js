import fs from 'fs'
import chalk from 'chalk'

function promessa(bool) {
    const x = bool;
    return new Promise((resolve, reject) => {
      if (!x) {
        reject(new Error(chalk.bgBlue("falha na promessa")));
      }
      resolve(chalk.greenBright("sucesso na promessa"));
    });
   }
   
   function exibeResposta(textoResult) {
    console.log(textoResult);
   }
   
   promessa(false)
    .then((texto) => exibeResposta(texto))
   // sucesso na promessa

// console.log(chalk.blue.bgWhite.bold('Alura'));
// console.log(chalk.blue('curso', 'de', 'Node.js'));
// console.log(chalk.red('vermelho', chalk.underline.bgBlue('azul')));
// console.log(`
// CPU: ${chalk.red('90%')}
// RAM: ${chalk.green('40%')}
// DISK: ${chalk.yellow('70%')}
// `);
// console.log('São geralmente recuperados a partir de um objeto [FileList](https://developer.mozilla.org/pt-BR/docs/Web/API/FileList) que é retornado como resultado da seleção, pelo usuário, de arquivos através do elemento [<input>](https://developer.mozilla.org/pt-BR/docs/Web/HTML/Element/Input')
// console.log('São geralmente recuperados a partir de um objeto [FileList](https://developer.mozilla.org/pt-BR/docs/Web/API/FileList) que é retornado como resultado da seleção, pelo usuário, de arquivos através do elemento [<input>](https://developer.mozilla.org/pt-BR/docs/Web/HTML/Element/Input')
