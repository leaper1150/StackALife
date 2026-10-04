# StackALife 🧱

> **Work in Progress (WIP)** — A spatial life tracker and task organizer where to-do items behave like physical, weighted blocks. Clear your stack, clear your mind.

---

## 💡 What is StackALife?

Traditional to-do lists treat every obligation identically. A quick 3-minute email looks identical to a 10-hour project. Because flat bullet points fail to communicate cognitive weight, prioritizing what to tackle next is often harder than the work itself.

**StackALife** turns your obligations into spatial blocks inspired by a blend of **Tetris** and **treemaps**:
* **Weighted Foundations (1–10):** Larger, multi-day endeavors settle as heavy foundation blocks at the bottom of your screen. Lighter chores pack the spaces on top.
* **Automated Stacking:** No tedious drag-and-drop puzzles. The app automatically calculates geometry, sorting heavy items downward so you can see your real foundation at a glance.
* **Urgency Heatmap:** Blocks dynamically shift color as deadlines draw near (Calm $\rightarrow$ Amber $\rightarrow$ Crimson), letting you know what needs clearing first.
* **Hand-Drawn & Tactile:** Art, textures, crack overlays, and clear animations are hand-drawn with a stylus/pen, giving the app an organic sketchbook feel backed by physical haptics.
* **Zero-Guilt Progression:** The long-term goal is simply to clear your stack like Tetris. No point penalties, no game-over screens—just clear, visual feedback to keep your life balanced.

---

## ✨ Planned Features

* **Spatial Category Vessels:** Swipe left and right between separate chambers for different life domains (e.g., *Personal*, *Work*, *Home*).
* **Dual Views:** Switch between the spatial block vessel and a clean, standard checklist with a single tap.
* **Urgency-Based Color Shifts:** Real-time deadline tracking that changes block appearance from peaceful slates to glowing ambers and pulsing crimsons.
* **Crumble & Fall Physics:** Completing a task shatters the block, logs it to history, and causes upper blocks to tumble downward with tactile haptic feedback.
* **Recurring Habits:** Routine daily or weekly tasks automatically clear and drop fresh into the stack on schedule.
* **100% Offline-First:** Fully functional without an internet connection, with seamless background sync when connected.

---

## 🛠️ The Tech & Design Vision

* **Multiplatform Core:** Built using **Kotlin Multiplatform (KMP)** and **Compose Multiplatform**, targeting Android first with plans for Desktop and other platforms.
* **Hardware-Accelerated 2D Canvas:** Custom block packing and physics animations drawn natively on Compose `Canvas`—no bulky game engines required.
* **Stylus-Drawn Asset Pipeline:** Hand-sketched textures, category icons, and a 4-frame crumble animation sequence designed directly with a laptop pen.
* **Private & Serverless Sync:** Local embedded SQLite storage paired with a hosted Supabase backend for zero-latency offline use and private cloud backup.

---

## 🗺️ Project Status & Next Steps

This project is actively in design and early development:

- [x] Core product concept, sizing math (1–10), and interaction design
- [x] Stacking gravity and 4-column packing algorithm design
- [ ] Hand-drawing core UI icons, block textures, and particle sprites
- [ ] Compose Multiplatform Canvas interactive prototype
- [ ] Task CRUD and list-view fallback
- [ ] Tactile haptics and crumble animations
- [ ] Offline local storage & cloud sync integration

---

*StackALife is currently an independent prototype in active development.*
