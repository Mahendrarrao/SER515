/**
 * This file contains the javascript code for the application header
 * 
 * @author - akshaykumardileep
 * @date - 10/07/2019
 * 
 */
count = 0

  $(document).ready(function () {
    $('#btAdd').click(function () {
        AddText();
    });
    function AddText() {
      if(count<=10){
        count = count + 1 //head is assigned a unique ID for each question answer set
        $('<div id= "head'+count+'"><div id="heading'+count+'"><h3>Question' +count+'</h3></div><input type="text" placeholder="Question'+count+'" name="Question'+count+'"></br><textarea placeholder="Solution" name="Solution'+count+'" type="text"></textarea><hr></div></div></div>').appendTo('#baseWrapper');
    }
  }
    $('#btRemove').click(function () {
      RemoveText();
});
    function RemoveText() {
      var val = "head"
      var value = val.concat(count);
      console.log(value);
      if(count>0){
      var element = document.getElementById(value);
      document.getElementById("baseWrapper").removeChild(element)
      count = count - 1;
    }
  }
});