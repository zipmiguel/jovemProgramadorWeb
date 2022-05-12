$.ajax({
    type: "GET",
    dataType: "json",
    url: "https://servicodados.ibge.gov.br/api/v1/localidades/estados",
    success: function (data){
        data.sort(function(a,b){
            return a.nome < b.nome ? -1 : a.nome > b.nome ? 1:0;
        })

        let option = "<option default>Selecione um estado</option>";
        
        $.each(data,function(i,value){
            // console.log(i + " " + value.sigla +" "+ value.nome);
            option += "<option id="+value.id+" value="+value.sigla+">"+ value.nome +"</option>";
            
        })
        $("#endereco").find("#estado").append(option);
    },
    error: function (){

    },
    beforeSend: function (){

    }
})

function mudancaCidade(){
    $("#endereco").find("#endereco-cidade").show();
    //pegaria o 𝙫𝙖𝙡𝙪𝙚 do elemento
    // const id = $("#estado").val();
    const id = $("#estado").find(":selected").attr("id");
    // alert("Você selecionou o valor "+id);

    $.ajax({
        type: "GET",
        dataType: "json",
        url: "https://servicodados.ibge.gov.br/api/v1/localidades/estados/"+id+"/distritos",
        success: function (data){
            data.sort(function(a,b){
                return a.nome < b.nome ? -1 : a.nome > b.nome ? 1:0;
            })

            // let option = "<option default>Selecione uma cidade</option>";
            let option = "";
            $.each(data,function(i,value){
                option += `<option id="${value.id}" value = "${value.nome}">${value.nome}</option>`;
            })
            $("#endereco").find("#cidade").append(option);
        },
        error: function (data){
            
        },
        beforeSend: function (){
            $("#endereco").find("#cidade option").remove();
            // $("#resultado").show();
        }
    })
}
function escolher(){
    $("body").find("#resultado").show();
    $("#resultado").find(".estado-atual").text($("#estado").find(":selected").text());
    $("#resultado").find(".cidade-atual").text($("#cidade").find(":selected").text());
}

function fechar(){
    $("#resultado").hide();
}