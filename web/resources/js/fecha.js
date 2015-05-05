    ahora = new Date();
    ahoraDay = ahora.getDate();
    ahoraMonth = ahora.getMonth();
    ahoraYear = ahora.getFullYear();

    function cuantosDias(mes, anyo)
    {
        var cuantosDias = 31;
        if (mes == "Abril" || mes == "Junio" || mes == "Septiembre" || mes == "Noviembre")
            cuantosDias = 30;
        if (mes == "Febrero" && (anyo/4) != Math.floor(anyo/4))
            cuantosDias = 28;
        if (mes == "Febrero" && (anyo/4) == Math.floor(anyo/4))
            cuantosDias = 29;
        return cuantosDias;
    }

    function asignaDias()
    {
        comboDias = document.formAlta.diaNac;
        comboMeses = document.formAlta.mesNac;
        comboAnyos = document.formAlta.anyoNac;

        Month = comboMeses[comboMeses.selectedIndex].text;
        Year = comboAnyos[comboAnyos.selectedIndex].text;

        diasEnMes = cuantosDias(Month, Year);
        diasAhora = comboDias.length;

        if (diasAhora > diasEnMes)
        {
            for (i=0; i<(diasAhora-diasEnMes); i++)
            {
                comboDias.options[comboDias.options.length - 1] = null
            }
        }
        if (diasEnMes > diasAhora)
        {
            for (i=0; i<(diasEnMes-diasAhora); i++)
            {
                sumaOpcion = new Option(comboDias.options.length + 1);
                comboDias.options[comboDias.options.length]=sumaOpcion;
            }
        }
        if (comboDias.selectedIndex < 0) 
          comboDias.selectedIndex = 0;
     }

    function ponDia()
    {
        comboDias = eval("document.formAlta.diaNac");
        comboMeses = eval("document.formAlta.mesNac");
        comboAnyos = eval("document.formAlta.anyoNac");

        comboAnyos[0].selected = true;
        comboMeses[ahoraMonth].selected = true;
        asignaDias();
        comboDias[ahoraDay-1].selected = true;
    }

    function rellenaAnyos()
    {
        cadena = "";
        for (i=0; i<=100; i++)
        {
            cadena += "<option>";
            cadena += ahoraYear - i;
            cadena += "</option>";
        }
        return cadena;
    }