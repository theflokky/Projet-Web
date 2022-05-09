function show() {
	document.getElementById("myDropdown").classList.toggle("show");
}

function retourne() {
	window.history.back();
}

function condisplay() {
	flag=document.getElementById("CreneauType").selectedIndex;
	
	
	formParts = document.querySelectorAll("#FormPart");
	for(let i=0;i<formParts.length ;i++)
		if (i!=flag)
			formParts[i].style.display="none";
		else
			formParts[i].style.display="block";
			
}

const PersonneStatut =[
		  "NONE"                 
		, "FormPartProfEtudiant" 
		, "FormPartProf"         
		, "FormPartAdmin"        
]

function condisplay() {
	const query=window.location.search;//ce qu'il y a apres '?'
	const urlParams =new URLSearchParams(queryString);
	statut=urlParams.get("statut");
	
	formParts = document.querySelectorAll("#FormPart");
	for(formParti in formParts)
		if (formParti.id!=PersonneStatut[statut])
			formParti.style.display="none";
		else
			formParti.style.display="block";
			
}

condisplay();