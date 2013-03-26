package net.minecraft.src;

import net.minecraft.src.ExceptionMcoService;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreenCreateOnlineWorld;
import net.minecraft.src.Locations;
import net.minecraft.src.McoClient;

class ThreadCreateOnlineWorldScreen extends Thread {

   // $FF: synthetic field
   final GuiScreenCreateOnlineWorld field_98246_a;


   ThreadCreateOnlineWorldScreen(GuiScreenCreateOnlineWorld p_i11008_1_) {
      this.field_98246_a = p_i11008_1_;
   }

   public void run() {
      try {
         McoClient var1 = new McoClient(GuiScreenCreateOnlineWorld.func_96248_a(this.field_98246_a).field_71449_j);
         Locations var2 = var1.func_96385_d();
         if(var2.field_96599_a != null) {
            GuiScreenCreateOnlineWorld.func_98102_a(this.field_98246_a, var2.field_96599_a);
            GuiScreenCreateOnlineWorld.func_98100_a(this.field_98246_a, var2.field_96598_b);
            GuiScreenCreateOnlineWorld.func_98103_c(this.field_98246_a).add(new GuiButton(GuiScreenCreateOnlineWorld.func_98106_g(), this.field_98246_a.field_73880_f / 2 - 100, 135, GuiScreenCreateOnlineWorld.func_98101_b(this.field_98246_a).field_96395_b));
         }
      } catch (ExceptionMcoService var3) {
         ;
      } catch (Exception var4) {
         ;
      }

   }
}
