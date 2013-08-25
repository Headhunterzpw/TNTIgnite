package com.gmail.woodyc40.tntignite;

import org.bukkit.Material;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.*;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TNTIgnite extends JavaPlugin{
        @Override
        public void onEnable(){
                getServer().getPluginManager().registerEvents(new Listener(){
                        @EventHandler
                        public void onPlace(BlockPlaceEvent e){
                                if(e.getBlock().getType().equals(Material.TNT){
                                        if(e.getPlayer().hasPermission("tnt.ignite")){
                                                e.getBlock().setType(Material.AIR);
                                                e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.25, 0.5), TNTPrimed.class);
                                        }else{
                                                return;
                                        }
                                }
                        }
                }, this);
        }
} 
