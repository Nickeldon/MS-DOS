        var command, primary = "C:", logical =  "D:", extended = "E:", inputline = "C:/>";
        var Cformat = "NTFS", Dformat = "FAT32", Eformat = "FAT16";
        var cformatchoice, eformatchoice, dformatchoice;
        var calculateresponse;
        var timestop = 0;
        var textchoice = "Y", memory = "", text = "";
        var echodisabled = "on", loopphrase = "", loopfinal = "";
        var offcounter = 0, echoloop = 0;
        var spacecommand = "";
        var echoloopdirectory = ":";
        var space = false;
        var shutdown = 0;
        console.log("                                 *.                                                /@.                             .@%                                  "); 
        console.log("                               .,,,,                                              /@/@*                                                                 ");  
        console.log("                              .                                                  /&  ,@#   .@,   /@  @,*@@) ,@,*@  @% (@**@  %@*#/@  @/&@/@             ");
        console.log("                                 %%%%%%%%%                                      /# == .@&  .@.',/ @  ( ~~'  ,@. '  @% |@     *@  /@  @/  *@             ");
        console.log("                         %%%%%%%%%%%%%%%%%%%                                   /@      (@@ /@*   #@, @@@@@  (@*    @@ |@@@@. *&@/@| ,@(  #@.            ");        
        console.log("                      ........................                                                                                                          ");        
        console.log("                                        ........                              &@@.     /@@&,                                                            ");        
        console.log("                 *%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                            |&&@    /@&@                         |@                                    ");        
        console.log("               ,,**,******,              ,*********,                          |& #@. /@ &@ (#-=#@  (*==@, (@&#/@ ==|@===,@,*@ @,*@@) @/@/@   @,@).  @&## ");        
        console.log("                           *,           ,                                     |&  (@,@  &@ |/ ~~  @     @ (    @   |@   |@. ' | ~~'  @/  *@  @   )   '&  ");        
        console.log("                      %%%%%%%%#       ,         /%%%%%%%%.                    |@   (@   @@ |@@/(@ @%  _/) *@(.@@.  |@*, |@*   |@@@@ ,@(  #@. @* @  .@@*  ");        
        console.log("       .%%%%%%%%%%%%%%%%%%%%%%%%% #%%%%%%%%%%%%%%%%%%%%%%%%*                                      #' ',.        '                                        ");        
        console.log("     .........................................................                                    ^.   '@         ___________________________________    ");        
        console.log("                                                       ,,,,,,,,.                                    '''          |AMIBIOS (C)1999 American Megatrends    ");        
        console.log("*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                               | Released: 12/01/99                    ");
        console.log("");console.log("");
         
        console.log("AMD Ryzen 7 5800HS (tm)");
        console.log("");
        console.log("Verifing System memory...");
        /* Total memory currently available to the JVM */
        
        
        console.log("");
        for(var i = 0; i <= 196000; i++){
            console.log(i + "/196000 KiloBytes ");
            console.log("\r");
        }
        console.log();
        console.log(" OK ");
        console.log();
        console.log();
        
        console.log("WAIT");
        
        console.log(". ");
        console.log(". ");
        console.log(". ");
        
    
        
        console.log("\033[H\033[2J");  
        console.log("\r");
        
        console.log("\u001B[A");
        console.log("\033[H\033[2J");
        
        console.log("Starting MS-DOS...");
        console.log("HIMEM is testing extended memory");
        
        console.log(". ");
        console.log(". ");
        console.log(". ");
        
        console.log("done.");
        
        console.log("\n");
        console.log("\033[H\033[2J");
        
        console.log("Microsoft MS-DOS version 6.0.2");
        
        console.log("Copyright 2022 Microsoft Corp.");
        
        do {
            command = prompt(inputline);
            switch (command) {
                case "clear" : {
                    if (command == ("memory")){
                        memory = "";
                        prompt("Memory cleared");
                    }
                    else{
                        prompt("\033[H\033[2J");
                    }
                }break
                case "dir" : {
                    if(inputline == ("C:/>")) {
                        console.log("Volume in drive C has no label./n");
                        console.log("Volume Serial Number is F4AC-9851/n");
                        
                        console.log("Directory of C:///n");
                        
                        console.log("09/02/2015 12:41 PM /n");
                        
                        console.log("$SysReset/n");
                        
                        console.log("05/30/2016 06:22 PM 93 HaxLogs.txt/n");
                        
                        console.log("05/07/2016 02:58 AM PerfLogs/n");
                        
                        console.log("05/22/2016 07:55 PM Program Files/n");
                        
                        console.log("05/31/2016 11:30 AM Program Files (x86)/n");
                        
                        console.log("07/30/2015 04:32 PM Temp/n");
                        
                        console.log("05/22/2016 07:55 PM Users/n");
                        
                        console.log("05/22/2016 08:00 PM Windows/n");
                        
                        console.log("05/22/2016 09:50 PM Windows.old/n");
                        
                        console.log("1 File(s) 93 bytes");
                    }
                    if(inputline == ("D:/>")){
                        console.log("DIR FOLDER D");
                        console.log("Volume in drive D has no label./n");
                        console.log("Volume Serial Number is F4AC-9851/n");
                    }if(inputline == ("E:/>")){
                        console.log("DIR FOLDER E");
                        console.log("Volume in drive E has no label./n");
                        console.log("Volume Serial Number is F4AC-9851/n");
                    }
                }break
                case "text" : {
                    if(command == ("e")){
                        console.log("\033[H\033[2J");
                    console.log("");
                    do{
                    prompt("Write here |");
                    text = prompt("           V");
                    memory += text;
                    
                    textchoice = prompt("Continue?");
                }while(textchoice == ("Y"));
                prompt("Return");
        prompt("\033[H\033[2J");}

                }break
                case "echo", "@echo" : {
                    for(var e = 1; e <= command.length -1; e++){
                    if(command == (""))
                    prompt();
                    if(command == ("off") || echodisabled == ("off")){
                    echodisabled = "off";
                    if(offcounter == 0){
                    prompt("Echomode_disabled");}
                    offcounter ++;}
                    if(echoloop == 1){
                    loopphrase =  " " + command;
                   loopfinal += loopphrase;}
                    if(command == ("on") || echodisabled == ("on")){
                        offcounter = 0;
                    echodisabled = "on";
                    prompt(" " + command);}}
                    
                }break
                
                case ":" : {
                    echoloopdirectory[1] = command;
                    if(echodisabled == ("off")){
                    echoloop = 1;}
                    else
                    prompt();
                }break
                case "goto" : {
                    if(command == (echoloopdirectory[1])){
            while(echoloop == 1){
                
    prompt(loopfinal);}}
                }break
                case "memory" : {
                    prompt(memory);
                }break
                case "whoami" : {
                    prompt("In developpement!");
                    
                    prompt("User: ");
                    prompt("Session: ");
                    prompt("Computer s/n: ");
                    prompt("Sudo rights?: ");
                }break
                
                

                case "cd" : {

                        if ((extended + "/") == (command)){
                            if((command + ">") == (inputline + ".")){
                                prompt("Already chosen directory");
                            }else{
                                inputline = (extended + "/>");
                            }
                        }
                    else if ((primary + "/") == (command)){
                        if((command + ">") == (inputline + ".")){
                            prompt("Already chosen directory");
                        }else{
                            inputline = (primary + "/>");
                        }
                    }
                    else if ((logical + "/") == (command)){
                        if((command + ">") == (inputline + ".")){
                            prompt("Already chosen directory");
                        }else{
                            inputline = (logical + "/>");
                        }
                    }else {
                            alert("Unreachable drive");
                        }
                    }break
                    
                    case "clock" : {
                        prompt(new Date());
                    }break
                    case "timer" : {
                        var i = 0;
                        var min = 0;
                        var h = 0;
                        prompt("Stopping time?");
                        timestop = prompt(" ");
                        prompt("Format?");
                        prompt("hours               1)");
                        prompt("minutes             2)");
                        prompt("seconds             3)");
                        var Timechoice = prompt(" ");
                        if(Timechoice == ("1)")){
                            timestop = timestop * 3600;
                        }
                        else if(Timechoice == ("2)")){
                            timestop = timestop*60;
                        }
                        else if(Timechoice == ("3)")){
                            timestop = timestop*1;
                        }
                        for (; i<=timestop -1  ; ) {
                            i++;
                            if (i == 60) {
                                min++;
                                i = 0;
                            } else if (min == 60) {
                                h++;
                                min = 0;
                            } else if (h == 24) {
                                h = 0;
                            }
                            if (h < 10) {
                                prompt("0" + h + ":");
            
                            } else {
                                prompt(h + ":");
                            }
                            if (min < 10) {
                                prompt("0" + min + ":");
                            } else {
                                prompt(min + ":");
                            }
                            if (i < 10)
                                prompt("0" + i);
                            else
                                prompt(i);
            
                            prompt("\r");
                        }}break
                case "calculate", "calc" : {
                    
                    prompt("Microsoft Calculator version 1.0.1");
                    
                    prompt("Input number 1: ");
                    var number1 = prompt(" ");
                    prompt(" (addition : 1)) ");
                    prompt(" (substraction) : 2)) ");
                    prompt(" (division) : 3)) ");
                    prompt(" (multiplication : 3)) ");
                    var calculatechoice = prompt(" ");
                    prompt("Input number 2: ");
                    var number2 = prompt(" ");
                    if(number2 == 0 && calculatechoice == 3){
                        alert("Cannot devise a number by zero");
                        alert("Unreachable mathematical statement");
                    }

                        if (calculatechoice == 1){
                            calculateresponse = (number2 + number1);
                            prompt("anwser: " + calculateresponse);
                        }
                        else if (calculatechoice == 2){
                            calculateresponse = (number1 - number2);
                            prompt("awnser: " + calculateresponse);
                        }
                        else if (calculatechoice == 3){
                            calculateresponse = (number1/number2);
                            prompt("awnser: " + calculateresponse);
                        }
                        else if (calculatechoice == 4){
                            calculateresponse = (number1 * number2);
                            prompt("awnser: " + calculateresponse);
                        }
                        else{
                            alert("Unreachable mathematical statement");
                        }
                }break
                case "Service.MS.paint.dat" : {
                    prompt("In developpement!");
                }break
                case "shutdown" :{
                    if(command == ("") || command == (" "))
                    prompt();
                    else{
                    if(command == ("/s")){
                    prompt(" ");
                shutdown = 1;}
                if(command == ("/r")){
                    prompt("Restart? : In developpement!");
                    shutdown = 2;
                }}}break
                case "help" :{
                    prompt("calculate/calc                     Opens the mathematical calculator interpreter");
                    prompt("diskpart                           Opens the diskpart interpreter");
                    prompt("shutdown/s                         Turns off the system (Java JVM)");
                    prompt("cd                                 Directs to an chosen directory");
                    prompt("help                               posters the possible commands");
                    prompt("clear                              clears the console");
                    prompt("text-e                             opens the text editor ");
                    prompt("memory                             displays the previously written text stored in the memory");
                    prompt("timer                              opens the in-built timer (restart needed to exit)");
                    prompt("clock                              displays the actual date");
                    prompt("whoami                             displays the user's information");
                    prompt("echo/@echo                         Repeats users entry");
                    prompt("echo off / on                      disables or enables the feature");
                    prompt("goto                               enters the users echo mem entry");


                }break

                case "chkdsk" : {
                    
                    prompt("\033[H\033[2J");
                    
                    var filesyst = "";
                    if(inputline == (extended))
                    filesyst = Eformat;
                    if(inputline == (logical))
                    filesyst = Dformat;
                    if(inputline == (primary))
                    filesyst = Cformat;
                    prompt("The disk file system type is " + filesyst + ".");
                    
                    prompt("The volume name is MSDOS.");
                
                prompt("Execution of CHKDSK in read only mode begins");
                    prompt("Step 1: Verifying the system base file structure");
                    var f = "";
        timestop = 50;
        var s = 0;
        var min = 0;
        var h = 0;
        var turns = false;
        prompt("Estimated remaining time: ");
        prompt(" ");
        for(s = timestop ; s<=timestop && s >= 0 ; s--){
            
            if(turns)
            prompt("\r");
            if(s == 60){
                s = 0;
                min ++;
            }
            if(min == 60){
                min = 0;
                h++;
            }
            if (h < 10) {
                prompt("0" + h + ":");

            } else {
                prompt(h + ":");
            }
            if (min < 10) {
                prompt("0" + min + ":");
            } else {
                prompt(min + ":");
            }
            if (s < 10)
                prompt("0" + s);
            else
                prompt(s);
            turns = true;
            var progress = 0;
var prog = "";
    for(var i = 0; i<= progress; i++){
        
        prompt("=");
        prompt("\r"); 
    }

    while(progress < 100){
        
        prog += "=";
        progress += 5;
        if(progress > 95){
            progress -= 4;
            
        }
        if(progress == 99){
            
        }
        prompt("<|");
        prompt(prog + progress + "%" + prog);
        prompt("|>");
        prompt("\r");
    }
    prompt("\033[H\033[2J");
            
        }

                    
                    prompt("Files verifying completed");
                }break

                case "diskpart" : {
                    
                    prompt("\033[H\033[2J");
                    
                    prompt("Please use 'Sudo' command in the future for administrator rights");
                    
                    prompt("Microsoft DiskPart version 1.0.3");
                    prompt("Copyright (C) Microsoft Corporation.");
                    prompt("Computing module device : LAPTOP-876364C2");
                    var Diskcommand;
                    do {
                        
                        prompt(" ");
                        prompt("DISKPART>_ ");
                        Diskcommand = prompt(" ");
                        switch (Diskcommand) {
                            case "clear" : {
                                prompt("\033[H\033[2J");
                            }
                            case "format" : {
                                alert("CAUTION: Changing a drives format will erase the drive to what will occur to a complete suppression of data which cannot be recovered");
                                alert("Proceed? (Y/N) : Y: Cannot be canceled");
                                var formatchoice = prompt(" ").toUpperCase();
                                if(!formatchoice == ("Y"))
                                    alert("Operation canceled EE3");
                                else{
                                    prompt("Please choose a drive module to erase");
                                    prompt("List of drives");
                                    prompt(primary + "        Main System partition letter (primary - " + Cformat );
                                    prompt(logical + "        CD-ROM drive partition letter (logical - " + Dformat );
                                    prompt(extended + "        Detachable extern storage module (extended - " + Eformat );
                                    var Diskletter = prompt(" ").toUpperCase();
                                    if (Diskletter == (primary)) {
                                        alert("CAUTION: The " + primary + " Drive is a Boot partition. If badly modified, System Corruption can occurs.");
                                        prompt("Proceed? Y/N");
                                        var Cdrivechoice = prompt(" ").toUpperCase();
                                        if (Cdrivechoice == ("Y")) {
                                            var Cformatmem = Cformat;
                                            prompt("Please choose the format type you want the drive be erased to");
                                            prompt("PC Partitions : 1)");
                                            var Choice1 = prompt(" ");
                                            if (Choice1 == ("1)")) {
                                                prompt("DOS, Windows and OS/2 file Systems : 1)");
                                                prompt("Unix file Systems : 2)");
                                                Choice1 = prompt(" ");
                                                if (Choice1 == ("1)")) {
                                                    prompt("Format to: ");
                                                    prompt("FAT32 : 1)");
                                                    prompt("exFAT : 2)");
                                                    prompt("NTFS : 2)");
                                                    cformatchoice = prompt(" ");

                                                        switch (cformatchoice) {
                                                            case "1)" : "FAT32";

                                                            case "2)" : "exFAT";

                                                            case "3)" : "NTFS";
                                                            default : Cformat;
                                                        };


                                                }
                                                }
                                                if (Choice1 == ("2)")) {
                                                    prompt("Mac OS X / Mac OS : 1)");
                                                    prompt("Linux : 2)");
                                                    Choice1 = prompt(" ");
                                                    if (Choice1 == ("2)")) {
                                                        prompt("Format to: ");
                                                        prompt("ext4 : 1)");
                                                        cformatchoice = prompt(" ");
                                                        if(cformatchoice == ("1)"))
                                                            Cformat == ("ext4");
                                                    }
                                                    if (Choice1 == ("1)")) {
                                                        prompt("Format to: ");
                                                        prompt("APFS : 1)");
                                                        prompt("HFS+ : 2)");
                                                        cformatchoice = prompt(" ");
                                                        switch(cformatchoice){
                                                            case "1)" : "APFS";
                                                            case "2)" : "HFS+";
                                                            default : Cformat;
                                                        };
                                                    }
                                                }
                                            
                                                var finalchanges = prompt("Applying changes? Y/N");
                                                if(finalchanges == ("Y")) {
                                                    
                                                    prompt(".");
                                                    
                                                    prompt(".");
                                                    
                                                    prompt(".");
                                                    
                                                    prompt("formatted successfully.");
                                                }

                                                else {
                                                    prompt("Operation canceled EE2");
                                                    Cformat = Cformatmem;
                                                }
                                            }
                                        else {
                                            prompt("Operation canceled EE1");
                                        }
                                        }
                                    else if (Diskletter == (extended)) {
                                        var Emem = Eformat;

                                            prompt("Please choose the format type you want the drive be erased to");
                                            prompt("PC Partitions : 1)");
                                            var Choice1 = prompt(" ");
                                            if (Choice1 == ("1)")) {
                                                prompt("DOS, Windows and OS/2 file Systems : 1)");
                                                prompt("Unix file Systems : 2)");
                                                Choice1 = prompt(" ");
                                                if (Choice1 == ("1)")) {
                                                    prompt("Format to: ");
                                                    prompt("FAT32 : 1)");
                                                    prompt("exFAT : 2)");
                                                    prompt("NTFS : 2)");
                                                    eformatchoice = prompt(" ");
                                                    switch (eformatchoice) {
                                                        case "1)" : "FAT32";

                                                        case "2)" : "exFAT";

                                                        case "3)" : "NTFS";
                                                        default :  Eformat;
                                                    };
                                                }
                                            }
                                            if (Choice1 == ("2)")) {
                                                prompt("Mac OS X / Mac OS : 1)");
                                                prompt("Linux : 2)");
                                                Choice1 = prompt(" ");
                                                if (Choice1 == ("2)")) {
                                                    prompt("Format to: ");
                                                    prompt("ext4 : 1)");
                                                    eformatchoice = prompt(" ");
                                                    if(eformatchoice == ("1)"))
                                                        Eformat == ("ext4");
                                                }
                                                if (Choice1 == ("1)")) {
                                                    prompt("Format to: ");
                                                    prompt("APFS : 1)");
                                                    prompt("HFS+ : 2)");
                                                    eformatchoice = prompt(" ");
                                                    switch(eformatchoice){
                                                        case "1)" : "APFS";break
                                                        case "2)" : "HFS+";break
                                                        default : Eformat;
                                                    };
                                                }
                                            }
                                            
                                                var finalchanges =prompt("Applying changes? Y/N");
                                                if(finalchanges == ("Y")) {
                                                    
                                                    prompt(".");
                                                    
                                                    prompt(".");
                                                    
                                                    prompt(".");
                                                    
                                                    prompt("formatted successfully.");
                                                }

                                                else {
                                                    prompt("Operation canceled EE2");
                                                    Dformat = Emem;
                                                } 
                                        }
                                        else if (Diskletter == (logical)) {
                                            var Dmem = Dformat;
    
                                                prompt("Please choose the format type you want the drive be erased to");
                                                prompt("PC Partitions : 1)");
                                                var Choice1 = prompt(" ");
                                                if (Choice1 == ("1)")) {
                                                    prompt("DOS, Windows and OS/2 file Systems : 1)");
                                                    prompt("Unix file Systems : 2)");
                                                    Choice1 = prompt(" ");
                                                    if (Choice1 == ("1)")) {
                                                        prompt("Format to: ");
                                                        prompt("FAT32 : 1)");
                                                        prompt("exFAT : 2)");
                                                        prompt("NTFS : 2)");
                                                        dformatchoice = prompt(" ");
                                                        switch (dformatchoice) {
                                                            case "1)" : "FAT32";break
    
                                                            case "2)" : "exFAT";break
    
                                                            case "3)" : "NTFS";break
                                                            default :  Dformat;
                                                        };
                                                    }
                                                }
                                                if (Choice1 == ("2)")) {
                                                    prompt("Mac OS X / Mac OS : 1)");
                                                    prompt("Linux : 2)");
                                                    Choice1 = prompt(" ");
                                                    if (Choice1 == ("2)")) {
                                                        prompt("Format to: ");
                                                        prompt("ext4 : 1)");
                                                        dformatchoice = prompt(" ");
                                                        if(dformatchoice == ("1)"))
                                                            Dformat == ("ext4");
                                                    }
                                                    if (Choice1 == ("1)")) {
                                                        prompt("Format to: ");
                                                        prompt("APFS : 1)");
                                                        prompt("HFS+ : 2)");
                                                        dformatchoice = prompt(" ");
                                                        switch(dformatchoice){
                                                            case "1)" : "APFS";break
                                                            case "2)" : "HFS+";break
                                                            default : Dformat;
                                                        };
                                                    }
                                                }
                                                
                                                    var finalchanges = prompt("Applying changes? Y/N");
                                                    if(finalchanges == ("Y")) {
                                                        
                                                        prompt(".");
                                                        
                                                        prompt(".");
                                                        
                                                        prompt(".");
                                                        
                                                        prompt("formatted successfully.");
                                                    }
    
                                                    else {
                                                        prompt("Operation canceled EE2");
                                                        Dformat = Dmem;
                                                    } 
                                            }
                                        

                            }
                            }break


                            case "assign" : {
                                prompt("Please choose a drive module to which will be assigned a Drive letter");
                                prompt("List of drives");
                                var primary1 = primary, logical1 = logical, extended1 = extended;
                                prompt(primary + "        Main System partition letter (primary - " +  Cformat + ")");
                                prompt(logical + "        CD-ROM drive partition letter (logical - " + Dformat + ")");
                                prompt(extended + "        Detachable extern storage module (extended - " + Eformat + ")");
                                var Diskletter = prompt(" ").toUpperCase();
                                if (Diskletter == (primary)) {
                                    alert("CAUTION: The " + primary + " Drive is a Primary and MBR partition. If badly modified, System Corruption can occurs.");
                                    prompt("Proceed? Y/N");
                                    var Cdrivechoice = prompt(" ").toUpperCase();
                                    if (Cdrivechoice == ("Y")) {
                                        
                                        primary = prompt("Please type which letter should it be assigned");
                                        if(primary == (logical) || primary == (extended)){
                                            alert("Operation canceled");
                                            
                                            alert("The chosen letter is already assigned to another drive");
                                            alert("Assigning it to another letter");
                                            
                                            prompt(".");
                                            
                                            prompt(".");
                                            
                                            prompt(".");
                                            
                                            prompt("done.");
                                            primary = Math.random()
                                        }
                                        else {
                                            prompt(primary1 + " letter will be changed to " + primary + ". Ok? (Y/N)");
                                            Cdrivechoice = prompt(" ").toUpperCase();
                                            if (Cdrivechoice == ("Y")) {
                                                
                                                prompt("Processing");
                                                
                                                prompt(".");
                                                
                                                prompt(".");
                                                
                                                prompt(".");
                                                
                                                prompt("Ok!");
                                                inputline == (primary + "/>");
                                                primary1 = primary;
                                            } else {
                                                primary = primary1;
                                                alert("Operation canceled");
                                            }
                                        }
                                    }
                                }
                                if (Diskletter == (logical)) {
                                    prompt("Please type which letter should it be assigned");
                                    logical = prompt(" ").toUpperCase();
                                    if(logical == (primary) || logical == (extended)){
                                        alert("Operation canceled");
                                        
                                        alert("The chosen letter is already assigned to another drive");
                                        alert("Assigning it to another letter");
                                        
                                        prompt(".");
                                        
                                        prompt(".");
                                        
                                        prompt(".");
                                        
                                        prompt("done.");
                                    }
                                    else {
                                        prompt(logical1 + " letter will be changed to " + logical + ". Ok? (Y/N)");
                                        var Ddrivechoice = prompt(" ");
                                        if (Ddrivechoice == ("Y")) {
                                            
                                            prompt("Processing");
                                            
                                            prompt(".");
                                            
                                            prompt(".");
                                            
                                            prompt(".");
                                            
                                            prompt("Ok!");
                                            logical1 = logical;
                                            inputline == (logical + "/>");
                                        } else {
                                            logical = logical1;
                                            alert("Operation canceled");
                                        }
                                    }
                                }
                                if (Diskletter == (extended)) {
                                    prompt("Please type which letter should it be assigned");
                                    extended = prompt(" ").toUpperCase();
                                    if(extended == (logical) || extended == (primary)){
                                        alert("Operation canceled");
                                        
                                        alert("The chosen letter is already assigned to another drive");
                                        alert("Assigning it to another letter");
                                        
                                        prompt(".");
                                        
                                        prompt(".");
                                        
                                        prompt(".");
                                        
                                        prompt("done.");
                                    }
                                    else {
                                        prompt(extended1 + " letter will be changed to " + extended + ". Ok? (Y/N)");
                                        var Edrivechoice = prompt(" ").toUpperCase();
                                        if (Edrivechoice == ("Y")) {
                                            
                                            prompt("Processing");
                                            
                                            prompt(".");
                                            
                                            prompt(".");
                                            
                                            prompt(".");
                                            
                                            prompt("Ok!");
                                            extended1 = extended;
                                            inputline == (extended + "/>");
                                        } else {
                                            extended = extended1;
                                            alert("Operation canceled");
                                        }
                                    }
                                }
                            }break
                            case "Listdisk" : {
                                prompt("List of drives");
                                prompt(primary + "        Main System partition letter (Primary - " + Cformat);
                                prompt(logical + "        CD-ROM drive partition letter (Logical - " + Dformat);
                                prompt(extended + "        Detachable extern storage module (Extended - " + Eformat);
                            }break
                            
                            case "exit" : {

                                prompt("Verifying corrupted files");
                                
                                prompt(".");
                                
                                prompt(".");
                                
                                prompt(".");
                                
                                prompt(" ");
                                
                                prompt("Verifying bad sectors on drives");
                                
                                prompt(".");
                                
                                prompt(".");
                                
                                prompt(".");
                                
                                if(extended == (logical) || extended == (primary) || logical == (primary) || !Cformat == ("NTFS")){
                                    prompt("\033[H\033[2J");
                                    alert("ALERT: ILLEGAL OPERATTION ERROR");
                                    //Make it crash

                                }
                                else {
                                    prompt("Done!");
                                    prompt("No system integrity violation detected on drives");
                                }
                            }break
                            default : {
                                prompt("assign               Assigns a drive letter or mount point to the volume with focus.");
                                prompt("Listdisk             Shows a list of every drive module");
                                prompt("exit                 Exits the diskpart command interpreter.");
                            }
                        }
                        }while (!Diskcommand == ("exit"));
                    prompt("Exiting Diskpart...");
                    prompt("");
                    }break
                    

                default : {alert("'" + command + "'" + " Is not recognised as an command line or is a Syntax violation");}}
            }while(shutdown != 1);
            
            prompt("\033[H\033[2J");
        prompt("Shutting down MS-DOS...");
        
        prompt("\033[H\033[2J");
        
