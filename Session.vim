let SessionLoad = 1
let s:so_save = &g:so | let s:siso_save = &g:siso | setg so=0 siso=0 | setl so=-1 siso=-1
let v:this_session=expand("<sfile>:p")
silent only
silent tabonly
cd ~/Documents/KsModMc
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
let s:shortmess_save = &shortmess
if &shortmess =~ 'A'
  set shortmess=aoOA
else
  set shortmess=aoO
endif
badd +27 ~/Documents/KsModMc/src/main/java/timi/mimi/kys/Kys.java
badd +18 ~/Documents/KsModMc/src/main/java/timi/mimi/kys/item/ModItems.java
badd +24 ~/Documents/KsModMc/src/main/java/timi/mimi/kys/item/ModItemGroups.java
argglobal
%argdel
edit ~/Documents/KsModMc/src/main/java/timi/mimi/kys/item/ModItemGroups.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
split
1wincmd k
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe '1resize ' . ((&lines * 42 + 29) / 58)
exe '2resize ' . ((&lines * 12 + 29) / 58)
argglobal
balt ~/Documents/KsModMc/src/main/java/timi/mimi/kys/item/ModItems.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=99
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 24 - ((17 * winheight(0) + 21) / 42)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 24
normal! 0
wincmd w
argglobal
if bufexists(fnamemodify("term://~/Documents/KsModMc//98913:/usr/bin/zsh;\#toggleterm\#1", ":p")) | buffer term://~/Documents/KsModMc//98913:/usr/bin/zsh;\#toggleterm\#1 | else | edit term://~/Documents/KsModMc//98913:/usr/bin/zsh;\#toggleterm\#1 | endif
if &buftype ==# 'terminal'
  silent file term://~/Documents/KsModMc//98913:/usr/bin/zsh;\#toggleterm\#1
endif
balt ~/Documents/KsModMc/src/main/java/timi/mimi/kys/item/ModItemGroups.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=99
setlocal fml=1
setlocal fdn=20
setlocal fen
let s:l = 955 - ((8 * winheight(0) + 6) / 12)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 955
normal! 032|
wincmd w
2wincmd w
exe '1resize ' . ((&lines * 42 + 29) / 58)
exe '2resize ' . ((&lines * 12 + 29) / 58)
tabnext 1
if exists('s:wipebuf') && len(win_findbuf(s:wipebuf)) == 0 && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20
let &shortmess = s:shortmess_save
let &winminheight = s:save_winminheight
let &winminwidth = s:save_winminwidth
let s:sx = expand("<sfile>:p:r")."x.vim"
if filereadable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &g:so = s:so_save | let &g:siso = s:siso_save
set hlsearch
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
