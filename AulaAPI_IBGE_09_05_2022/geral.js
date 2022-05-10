$.ajax({
    type: "GET",
    dataType: "json",
    url: "https://servicodados.ibge.gov.br/api/v1/localidades/estados",
    success: function (estado){
        estado.sort(function(a,b){
            return a.nome < b.nome ? -1 : a.nome > b.nome ? 1:0;
        })

        let option = "<option default>Selecione um estado</option>";
        
        $.each(estado,function(i,value){
            // console.log(i + " " + value.sigla +" "+ value.nome);
            option += "<option id="+value.id+" value="+value.sigla+">"+ value.nome +"</option>";
            
        })
        estado.sort();
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
    alert("Você selecionou o valor "+id);
}